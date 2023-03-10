package task.kotlin.`fun`

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class KokoEatingBananasTest {

    val testClass = KokoEatingBananas()

    @Test
    fun minEatingSpeedCase1() {
        val piles = intArrayOf(3,6,7,11)
        val h = 8
        assertEquals(4, testClass.minEatingSpeed(piles, h))
    }

    @Test
    fun minEatingSpeedCase2() {
        val piles = intArrayOf(30,11,23,4,20)
        val h = 5
        assertEquals(30, testClass.minEatingSpeed(piles, h))
    }

    @Test
    fun minEatingSpeedCase3() {
        val piles = intArrayOf(30,11,23,4,20)
        val h = 6
        assertEquals(23, testClass.minEatingSpeed(piles, h))
    }
}