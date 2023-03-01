package top_interview_questions.medium;

import org.junit.jupiter.api.Test;
import task.java.interview.medium.WordSearch;

import static org.junit.jupiter.api.Assertions.*;

class WordSearchTest {

    WordSearch testClass = new WordSearch();

    @Test
    void exist() {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        assertTrue(testClass.exist(board, word));
    }

    @Test
    void notExist() {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'}};
        String word = "ABCB";
        assertFalse(testClass.exist(board, word));
    }
}