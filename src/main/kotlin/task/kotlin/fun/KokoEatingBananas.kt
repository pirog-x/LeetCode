package task.kotlin.`fun`

class KokoEatingBananas {
    fun minEatingSpeed(piles: IntArray, h: Int): Int {
        if (piles.size == h) return piles.max()

        var left = 1
        var right = piles.max()
        var mid:Int

        while (left <= right) {
            mid = (left + right) / 2

            if (tryToEat(piles, h, mid)) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        return left
    }

    private fun tryToEat(piles: IntArray, h: Int, timeForPile: Int): Boolean {
        var tmp: Long = 0
        for (i in piles.indices) {
            tmp += piles[i] / timeForPile
            if (piles[i] % timeForPile != 0) tmp++
        }
        return tmp <= h
    }
}