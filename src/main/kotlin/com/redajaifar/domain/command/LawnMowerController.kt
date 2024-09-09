package com.redajaifar.domain.command

import com.redajaifar.domain.model.*

class LawnMowerController {

    fun mow(lawn: Lawn, mower: Mower, instructions: Instructions): Mower {

        val maxX = lawn.x
        val maxY = lawn.y

        var x = mower.position.first
        var y = mower.position.second
        var orientation = mower.orientation

        val directions = Orientation.values()

        // Process each instruction in the instructions list
        for (instruction in instructions) {
            when (instruction) {
                Instruction.G -> {
                    // Turn left (counter-clockwise)
                    orientation = directions[(directions.indexOf(orientation) - 1 + 4) % 4]
                }

                Instruction.D -> {
                    // Turn right (clockwise)
                    orientation = directions[(directions.indexOf(orientation) + 1) % 4]
                }

                Instruction.A -> {
                    // Move forward in the current direction
                    val move = movements[orientation]!!
                    val newX = x + move.first
                    val newY = y + move.second

                    // Ensure the mower stays within grid bounds
                    if (newX in 0..maxX && newY in 0..maxY) {
                        x = newX
                        y = newY
                    }
                }
            }
        }
        return Mower(Pair(x, y), orientation)
    }
}
