package com.redajaifar.domain

import com.redajaifar.domain.command.LawnMowerController
import com.redajaifar.domain.model.*
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LawnMowerControllerTest {

    private val lawnMowerController: LawnMowerController = LawnMowerController()

    @Test
    fun `should instruct a mower correctly`() {

        val lawn: Lawn = Lawn(5, 5)
        val mower: Mower = Mower(Pair(1, 2), Orientation.N)
        val instructions: Instructions = listOf(
            Instruction.G,
            Instruction.A,
            Instruction.G,
            Instruction.A,
            Instruction.G,
            Instruction.A,
            Instruction.G,
            Instruction.A,
            Instruction.A
        )


        val instructedMower = lawnMowerController.mow(lawn, mower, instructions)

        assertEquals(instructedMower, Mower(Pair(1, 3), Orientation.N))
    }


}