package com.redajaifar.domain.model

class Mower(val position: Pair<Int, Int>, val orientation: Orientation) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Mower

        if (position.first != other.position.first || position.second != other.position.second) return false
        if (orientation != other.orientation) return false

        return true
    }

    override fun hashCode(): Int {
        var result = position.hashCode()
        result = 31 * result + orientation.hashCode()
        return result
    }
}