// 806. Number of Lines To Write String

public class StringPixels {
    public int[] numberOfLines(int[] widths, String s) {
        int[] outarr = new int[2];
        int lines = 1;
        // int pixels = 0;
        int count = 0;
        // System.out.println("-");
        for (int i = 0; i < widths.length; i++) {
            // if (count < 100) {
            // count += widths[i];
            // pixels = count;
            // // System.out.println("i = " + i + ", pixels = " + pixels);
            // } else {
            // lines++;
            // pixels = count;
            // // pixels += widths[i];
            // count = 0;
            // }
            if (count + widths[i] > 100) {
                lines++;
                count = widths[i];
            } else {
                count += widths[i];
            }
        }
        outarr[0] = lines;
        outarr[1] = count;
        return outarr;
    }

    public static void main(String[] args) {
        StringPixels obj = new StringPixels();
        int[] widths = { 4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                10, 10 };
        String s = "bbbcccdddaaa";
        // int[] widths = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
        // 10, 10, 10, 10, 10, 10, 10, 10, 10,
        // 10, 10 };
        // String s = "abcdefghijklmnopqrstuvwxyz";
        int[] result = obj.numberOfLines(widths, s);
        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
