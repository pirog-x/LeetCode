package top_interview_questions.medium;

// https://leetcode.com/problems/word-search/

// m = board.length
// n = board[0].length

// time: O(n * m * 4^word.length())
// space: O(n * m)

import java.util.*;

public class WordSearch {
    private final Set<Map.Entry<Integer, Integer>> usedLetter = new HashSet<>();

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (go(board, i, j, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean go(char[][] board, int m, int n, String word, int currentLetter) {
        if (currentLetter >= word.length()) return true;

        if (m < 0 || n < 0 ||
            m >= board.length || n >= board[0].length ||
            word.charAt(currentLetter) != board[m][n]) return false;

        Map.Entry<Integer, Integer> pair = new AbstractMap.SimpleEntry<>(m, n);
        if (usedLetter.contains(pair))  return false;

        usedLetter.add(pair);

        boolean result = go(board, m, n + 1, word, currentLetter + 1) ||
                         go(board, m, n - 1, word, currentLetter + 1) ||
                         go(board, m + 1, n, word, currentLetter + 1) ||
                         go(board, m - 1, n, word, currentLetter + 1);

        usedLetter.remove(pair);
        return result;
    }
}
