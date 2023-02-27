package task.java.leetcode75.lvl2;

public class MultiplyStrings {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int l1 = num1.length(), l2 = num2.length();
        int[] res = new int[l1 + l2];

        for (int i = l1 - 1; i >= 0; i--) {
            for (int j = l2 - 1; j >= 0; j--) {
                int sum = Character.getNumericValue(num1.charAt(i)) * Character.getNumericValue(num2.charAt(j));

                sum += res[j + i + 1];
                res[j + i + 1] = sum % 10;
                res[j + i] += sum / 10;
            }
        }
        StringBuilder builder = new StringBuilder();
        for (int i : res) {
            if (builder.isEmpty() && i == 0) continue;
            builder.append(i);
        }
        return builder.toString();
    }
}
