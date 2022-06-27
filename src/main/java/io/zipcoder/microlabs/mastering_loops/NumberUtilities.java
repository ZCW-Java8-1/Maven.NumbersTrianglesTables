package io.zipcoder.microlabs.mastering_loops;

public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String s = "";
        for (int i = start; i < stop; i += 1) {
            if (i % 2 != 0) {
                s = s + String.valueOf(i);
            }
        }
        return s;
    }


    public static String getOddNumbers(int start, int stop) {
        String s = "";
        for (int i = start; i < stop; i += 1) {
            if (i % 2 == 0) {
                s = s + String.valueOf(i);
            }
        }
        return s;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String s = "";
        for (int i = start; i < stop; i += step) {
            s = s + String.valueOf(i*i);
        }
        return s;
    }

    public static String getRange(int stop) {
        return NumberUtilities.getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {
        return NumberUtilities.getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        String s = "";
        for (int i = start; i < stop; i += step) {
            s = s + String.valueOf(i);
        }
        return s;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String s = "";
        for (int i = start; i < stop; i += step) {
            s = s + String.valueOf((int) Math.pow(i, exponent));
        }
        return s;
    }
}
