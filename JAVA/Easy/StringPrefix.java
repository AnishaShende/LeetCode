// 2185. Counting Words With a Given Prefix

public class StringPrefix {
    public int prefixCount(String[] words, String pref) {
        int count = 0;
        String str;
        for (int i = 0; i < words.length; i++) {
            if(pref.length() <= words[i].length()){
                str = words[i].substring(0, pref.length());
                if (str.equals(pref)) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        StringPrefix obj = new StringPrefix();
        // String[] arr = { "pay", "attention", "practice", "attend" };
        // String[] arr = { "leetcode","win","loops","success" };
        String[] arr = { "sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","vbx","fsi","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","gqira","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh","sxyjellhlh" };
        String pref = "sxyjellhlh";
        System.out.println(obj.prefixCount(arr, pref));
    }
}
