package task.java.interview.medium;

import java.util.LinkedList;

/*
Time: n * 3m, 0 <= m <= 5
    n = strArr.length
    m = result.size()
    Time:
Space: n + m + a
    n = strArr.length
    m = result.size();
    a = String.join("-", result);
*/

public class LruCache {
    public String lruCache(String[] strArr) {
        if (strArr.length == 0) { return ""; }

        LinkedList<String> result = new LinkedList<>();
        final int maxCacheSize = 5;
        for (String element : strArr) {
            if (result.contains(element)) {
                result.remove(element);
            } else if (result.size() == maxCacheSize) {
                result.removeFirst();
            }
            result.add(element);
        }
        return String.join("-", result);
    }
}
