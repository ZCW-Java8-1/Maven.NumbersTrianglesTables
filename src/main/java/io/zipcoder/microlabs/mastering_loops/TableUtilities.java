package io.zipcoder.microlabs.mastering_loops;

public class TableUtilities {

    // yes the example in your README says 4 by 4 BUT TEST is 5 by 5!!
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }


    /**
     *   1 |  2 |  3 |
     *   2 |  4 |  6 |
     *   3 |  6 |  9 |
     * @param tableSize = 3
     * @return String
     */
    public static String getMultiplicationTable(int tableSize) {
        StringBuilder s = new StringBuilder();

        for (int i = 1; i <= tableSize; i++) {
            for (int j = 1; j <= tableSize; j++) {
                s.append(String.format("%3d |", i * j));
            }
            s.append("\n");
        }
        return s.toString();
    }
}
