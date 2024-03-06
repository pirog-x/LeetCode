package task.java.array_problems;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer[], List<String>> result = new HashMap<>();
        for (String str : strs) {
            Integer[] count = new Integer[26];
            Arrays.fill(count, 0);
            for (byte b : str.getBytes()){
                count[b - 'a']++;
            }
            if (result.containsKey(count)) {
                result.get(result).add(str);
            } else {
                result.put(count, new ArrayList<>(List.of(str)));
            }
        }
        List<List<String>> tmpResult = new ArrayList<>();
        for (Map.Entry<Integer[], List<String>> pair : result.entrySet()) {
            tmpResult.add(new ArrayList<>(pair.getValue()));
        }
        return tmpResult;
    }
}
