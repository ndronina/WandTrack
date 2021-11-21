package com.princessleia.wandtrack.ui.wandtrack.model

data class Spell(
    val id: Int,
    val name: String,
    val animDuration: Long,
    val step: Float,
    val colorRes: Int,
    val wandTracks: List<WandTrack>
)