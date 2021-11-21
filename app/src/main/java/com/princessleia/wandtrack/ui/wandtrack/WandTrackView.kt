package com.princessleia.wandtrack.ui.wandtrack

import android.animation.ValueAnimator
import android.content.Context
import android.graphics.Canvas
import android.graphics.DashPathEffect
import android.graphics.Paint
import android.graphics.Path
import android.graphics.RectF
import android.util.AttributeSet
import android.view.View
import android.view.animation.LinearInterpolator
import androidx.core.content.ContextCompat.getColor
import com.princessleia.wandtrack.R
import com.princessleia.wandtrack.ui.wandtrack.model.Spell
import com.princessleia.wandtrack.ui.wandtrack.model.WandTrack

private const val STROKE_WIDTH = 10f

class WandTrackView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var animator: ValueAnimator? = null

    private val paint = Paint()
    private val shadowPaint = Paint()
    private val path = Path()

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        canvas.drawPath(path, shadowPaint)
        canvas.drawPath(path, paint)
    }

    fun init(sizeRes: Int, spell: Spell) {
        val size = resources.getDimensionPixelSize(sizeRes)
        val dashes = floatArrayOf(spell.step, spell.step)

        initPaint(paint, spell.colorRes, dashes)
        initPaint(shadowPaint, R.color.shadow)
        initPath(size, spell)
        initAnimation(spell, dashes)
    }

    private fun initPaint(paint: Paint, colorRes: Int, dashes: FloatArray? = null) {
        paint.apply {
            color = getColor(context, colorRes)
            strokeWidth = STROKE_WIDTH
            isAntiAlias = true
            strokeCap = Paint.Cap.ROUND
            strokeJoin = Paint.Join.ROUND
            style = Paint.Style.STROKE
            dashes?.let { pathEffect = DashPathEffect(dashes, 0f) }
        }
    }

    private fun initPath(size: Int, spell: Spell) {
        spell.wandTracks.forEach { track ->
            when (track) {
                is WandTrack.Line -> {
                    track.startPosition?.let {
                        path.moveTo(size * it.xPercent, size * it.yPercent)
                    }
                    path.lineTo(
                        size * track.endPosition.xPercent,
                        size * track.endPosition.yPercent
                    )
                }
                is WandTrack.Arc -> {
                    val oval = RectF(
                        size * track.leftPercent,
                        size * track.topPercent,
                        size * track.rightPercent,
                        size * track.bottomPercent
                    )
                    path.arcTo(oval, track.startAngle, track.sweepAnge)
                }
            }
        }
    }

    private fun initAnimation(spell: Spell, dashes: FloatArray) {
        animator = ValueAnimator.ofFloat(spell.step, 0f).apply {
            interpolator = LinearInterpolator()
            addUpdateListener {
                paint.pathEffect = DashPathEffect(dashes, it.animatedValue as Float)
                invalidate()
            }
            duration = spell.animDuration
            repeatMode = ValueAnimator.RESTART
            repeatCount = ValueAnimator.INFINITE
        }
        animator?.start()
    }

    override fun onAttachedToWindow() {
        animator?.start()
        super.onAttachedToWindow()
    }

    override fun onDetachedFromWindow() {
        animator?.cancel()
        super.onDetachedFromWindow()
    }
}