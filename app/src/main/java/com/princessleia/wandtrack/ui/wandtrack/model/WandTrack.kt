package com.princessleia.wandtrack.ui.wandtrack.model

sealed class WandTrack {
    data class Line(
        val startPosition: WandPosition? = null,
        val endPosition: WandPosition
    ) : WandTrack()

    data class Arc(
        val leftPercent: Float,
        val topPercent: Float,
        val rightPercent: Float,
        val bottomPercent: Float,
        val startAngle: Float,
        val sweepAnge: Float
    ) : WandTrack()
}