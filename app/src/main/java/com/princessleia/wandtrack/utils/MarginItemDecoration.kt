package com.princessleia.wandtrack.utils

import android.graphics.Rect
import androidx.recyclerview.widget.RecyclerView

class MarginItemDecoration(
    private val top: Int = 0,
    private val start: Int = 0,
    private val end: Int = 0,
    private val bottom: Int = 0
) : RecyclerView.ItemDecoration() {

    override fun getItemOffsets(outRect: Rect, itemPosition: Int, parent: RecyclerView) {
        outRect.set(
            start,
            if (itemPosition == 0) top else 0,
            end,
            bottom
        )
    }
}