package com.princessleia.wandtrack.data

import com.princessleia.wandtrack.R
import com.princessleia.wandtrack.ui.wandtrack.model.Spell
import com.princessleia.wandtrack.ui.wandtrack.model.WandPosition
import com.princessleia.wandtrack.ui.wandtrack.model.WandTrack

class SpellsRepository {
    val spells = listOf(
        Spell(
            id = 0,
            name = "Alohomora",
            animDuration = 2000L,
            step = 800f,
            colorRes = R.color.brown,
            wandTracks = listOf(
                WandTrack.Arc(
                    leftPercent = 0.1f,
                    topPercent = 0.05f,
                    rightPercent = 0.9f,
                    bottomPercent = 0.8f,
                    startAngle = -80f,
                    sweepAnge = 350f
                ),
                WandTrack.Line(
                    endPosition = WandPosition(0.5f, 0.95f)
                )
            )
        ),
        Spell(
            id = 1,
            name = "Expelliarmus",
            animDuration = 2000L,
            step = 400f,
            colorRes = R.color.red,
            wandTracks = listOf(
                WandTrack.Line(
                    startPosition = WandPosition(0.1f, 0.1f),
                    endPosition = WandPosition(0.9f, 0.1f)
                ),
                WandTrack.Line(
                    endPosition = WandPosition(0.9f, 0.9f)
                )
            )
        ),
        Spell(
            id = 2,
            name = "Finite Incantatem",
            animDuration = 2000L,
            step = 400f,
            colorRes = R.color.blue,
            wandTracks = listOf(
                WandTrack.Line(
                    startPosition = WandPosition(0.1f, 0.1f),
                    endPosition = WandPosition(0.9f, 0.1f)
                ),
                WandTrack.Line(
                    endPosition = WandPosition(0.5f, 0.65f)
                ),
                WandTrack.Line(
                    endPosition = WandPosition(0.85f, 0.9f)
                )
            )
        ),
        Spell(
            id = 3,
            name = "Stupefy",
            animDuration = 2000L,
            step = 400f,
            colorRes = R.color.green,
            wandTracks = listOf(
                WandTrack.Line(
                    startPosition = WandPosition(0.9f, 0.1f),
                    endPosition = WandPosition(0.1f, 0.9f)
                ),
                WandTrack.Line(
                    endPosition = WandPosition(0.9f, 0.9f)
                )
            )
        ),
        Spell(
            id = 4,
            name = "Wingardium Leviosa",
            animDuration = 2000L,
            step = 800f,
            colorRes = R.color.yellow,
            wandTracks = listOf(
                WandTrack.Arc(
                    leftPercent = 0.1f,
                    topPercent = 0.2f,
                    rightPercent = 0.5f,
                    bottomPercent = 0.8f,
                    startAngle = 180f,
                    sweepAnge = 180f
                ),
                WandTrack.Arc(
                    leftPercent = 0.5f,
                    topPercent = 0.2f,
                    rightPercent = 0.9f,
                    bottomPercent = 0.73f,
                    startAngle = 180f,
                    sweepAnge = -180f
                ),
                WandTrack.Line(
                    endPosition = WandPosition(0.92f, 0.2f)
                ),
                WandTrack.Line(
                    endPosition = WandPosition(0.92f, 0.85f)
                )
            )
        ),
        Spell(
            id = 5,
            name = "Aquamenti",
            animDuration = 2000L,
            step = 800f,
            colorRes = R.color.blue,
            wandTracks = listOf(
                WandTrack.Line(
                    startPosition = WandPosition(0.15f, 0.85f),
                    endPosition = WandPosition(0.4f, 0.41f)
                ),
                WandTrack.Arc(
                    leftPercent = 0.4f,
                    topPercent = 0.15f,
                    rightPercent = 0.95f,
                    bottomPercent = 0.8f,
                    startAngle = 240f,
                    sweepAnge = 100f
                ),
            )
        ),
        Spell(
            id = 6,
            name = "Aresto Momento",
            animDuration = 2000L,
            step = 800f,
            colorRes = R.color.red,
            wandTracks = listOf(
                WandTrack.Line(
                    startPosition = WandPosition(0.1f, 0.8f),
                    endPosition = WandPosition(0.3f, 0.1f)
                ),
                WandTrack.Line(
                    endPosition = WandPosition(0.5f, 0.4f)
                ),
                WandTrack.Line(
                    endPosition = WandPosition(0.7f, 0.1f)
                ),
                WandTrack.Line(
                    endPosition = WandPosition(0.9f, 0.9f)
                )
            )
        ),
        Spell(
            id = 7,
            name = "Reparo",
            animDuration = 2000L,
            step = 800f,
            colorRes = R.color.purple,
            wandTracks = listOf(
                WandTrack.Arc(
                    leftPercent = 0.1f,
                    topPercent = 0.1f,
                    rightPercent = 0.9f,
                    bottomPercent = 0.88f,
                    startAngle = 150f,
                    sweepAnge = 285f
                ),
                WandTrack.Arc(
                    leftPercent = 0.2f,
                    topPercent = 0.2f,
                    rightPercent = 0.8f,
                    bottomPercent = 0.88f,
                    startAngle = 85f,
                    sweepAnge = 220f
                ),
            )
        ),
        Spell(
            id = 8,
            name = "Locomotor",
            animDuration = 2000L,
            step = 800f,
            colorRes = R.color.green,
            wandTracks = listOf(
                WandTrack.Line(
                    startPosition = WandPosition(0.6f, 0.9f),
                    endPosition = WandPosition(0.6f, 0.1f)
                ),
                WandTrack.Line(
                    endPosition = WandPosition(0.1f, 0.7f)
                ),
                WandTrack.Line(
                    endPosition = WandPosition(0.9f, 0.7f)
                ),
            )
        ),
    )

    val unforgivableCurses = listOf(
        Spell(
            id = 100,
            name = "Avada Kedavra",
            animDuration = 2000L,
            step = 800f,
            colorRes = R.color.green,
            wandTracks = listOf(
                WandTrack.Line(
                    startPosition = WandPosition(0.45f, 0.2f),
                    endPosition = WandPosition(0.2f, 0.6f)
                ),
                WandTrack.Line(
                    endPosition = WandPosition(0.65f, 0.5f)
                ),
                WandTrack.Line(
                    endPosition = WandPosition(0.4f, 0.98f)
                ),
            )

        )
    )
}