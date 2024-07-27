class demo {
    public int[] numberOfLines(int[] widths, String s) {
        int[] outarr = new int[2];
        int lines = 1;
        int count = 0;

        for (char c : s.toCharArray()) {
            int width = widths[c - 'a'];
            if (count + width > 100) {
                lines++;
                count = width;
            } else {
                count += width;
            }
        }

        outarr[0] = lines;
        outarr[1] = count;
        return outarr;
    }

    public static void main(String[] args) {
        demo d = new demo();
        int[] widths = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10,
                10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
        String s = "abcdefghijklmnopqrstuvwxyz";
        int[] outarr = d.numberOfLines(widths, s);
        System.out.println(outarr[0]);
        System.out.println(outarr[1]);

    }
}