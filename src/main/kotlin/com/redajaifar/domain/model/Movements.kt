package com.redajaifar.domain.model

val movements = mapOf(
    Orientation.N to Pair(0, 1),   // Move north (y increases)
    Orientation.E to Pair(1, 0),   // Move east (x increases)
    Orientation.S to Pair(0, -1),  // Move south (y decreases)
    Orientation.W to Pair(-1, 0)   // Move west (x decreases)
)
