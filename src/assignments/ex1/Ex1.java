package assignments.ex1;
public class Ex1 {

    public static int number2Int(String num) {
        if (!isNumber(num)) return -1;
        String[] parts = num.split("b");
        int base = Character.isDigit(parts[1].charAt(0)) ? Integer.parseInt(parts[1]) : parts[1].charAt(0) - 'A' + 10;
        return Integer.parseInt(parts[0], base);
    }

    public static boolean isNumber(String a) {
        if (a == null || a.isEmpty()) return false;
        if (!a.contains("b")) return false;
        String[] parts = a.split("b");
        if (parts.length != 2 || parts[0].isEmpty() || parts[1].isEmpty()) return false;
        try {
            int base = Character.isDigit(parts[1].charAt(0)) ? Integer.parseInt(parts[1]) : parts[1].charAt(0) - 'A' + 10;
            if (base < 2 || base > 16) return false;
            Integer.parseInt(parts[0], base);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static String int2Number(int num, int base) {
        if (num < 0 || base < 2 || base > 16) return "";
        String representation = Integer.toString(num, base).toUpperCase();
        String basePart = base < 10 ? String.valueOf(base) : String.valueOf((char) ('A' + base - 10));
        return representation + "b" + basePart;
    }

    public static boolean equals(String n1, String n2) {
        return number2Int(n1) == number2Int(n2);
    }

    public static int maxIndex(String[] arr) {
        int maxIdx = -1, maxVal = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int val = number2Int(arr[i]);
            if (val > maxVal) {
                maxIdx = i;
                maxVal = val;
            }
        }
        return maxIdx;
}

    }
