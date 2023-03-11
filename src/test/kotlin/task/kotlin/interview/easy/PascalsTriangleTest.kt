package task.kotlin.interview.easy

import org.assertj.core.api.Assertions
import org.junit.jupiter.api.Test

class PascalsTriangleTest {

    val testClass = PascalsTriangle()

    @Test
    fun generate() {
        val numRows = 5
        val expected = mutableListOf<List<Int>>(mutableListOf(1), mutableListOf(1,1), mutableListOf(1,2,1), mutableListOf(1,3,3,1), mutableListOf(1,4,6,4,1))
        Assertions.assertThat(testClass.generate(numRows)).isEqualTo(expected)
    }

    @Test
    fun generateOne() {
        val numRows = 1
        val expected = mutableListOf(mutableListOf(1))
        Assertions.assertThat(testClass.generate(numRows)).isEqualTo(expected)
    }
}