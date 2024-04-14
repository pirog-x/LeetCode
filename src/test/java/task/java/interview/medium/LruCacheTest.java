package task.java.interview.medium;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LruCacheTest {

    private final LruCache testable = new LruCache();

    @Test
    public void test() {
        // Arrange
        String[] strArr = new String[] {"A", "B", "C", "D", "A", "E", "D", "Z"};
        final String expected = "C-A-E-D-Z";
        // Act
        String actual = testable.lruCache(strArr);
        // Assert
        assertThat(actual).isEqualTo(expected);
    }
}
