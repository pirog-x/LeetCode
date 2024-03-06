package task.java.array_problems;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class GroupAnagramsTest {
    @Test
    public void testGroupAnagramsCase1() {
        GroupAnagrams testClass = new GroupAnagrams();
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> expected = List.of(
                List.of("bar"),
                List.of("nat", "tan"),
                List.of("ate", "eat", "tea")
        );
        assertThat(testClass.groupAnagrams(strs)).isEqualTo(expected);
    }
}