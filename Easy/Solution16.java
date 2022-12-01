class Solution16 {
    public String decodeMessage(String key, String message) {
        String secretMessage = new String();
        String origKey = new String();
        String finalKey = new String();
        // String str = new String();
        String alpha = "abcdefghijklmnopqrstuvwxyz";
        char ch;
        char a;
        int index;
        // System.out.println(origKey);
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == ' ') {
                continue;
            }
            else {
                origKey += key.charAt(i);
            }
        }
        for (int i = 0; i < origKey.length(); i++) {
            ch = origKey.charAt(i);
            if(finalKey.indexOf(ch) < 0){
                finalKey += ch;
            }
        }
        System.out.println(finalKey);
        // message = str;
        int count = 0;
        // System.out.println(key);
        for (int i = 0; i < message.length(); i++) {
            count = 0;
            a = message.charAt(i);
            if(message.charAt(i) == ' '){
                count++;
            }
            System.out.println(key);
            // System.out.println(a);
            if(count == 1){
                secretMessage += ' ';
                // index = key.indexOf(a);
            }
            else {
                index = finalKey.indexOf(a);
                secretMessage += alpha.charAt(index);
            }
            // System.out.println(index);
            // if (count == 1) {
            //     // secretMessage += ' ';
            // }
            System.out.println(secretMessage);
        }
        return secretMessage;
    }
    public static void main(String[] args) {
        Solution16 obj = new Solution16();
        String str = new String();
        // str = obj.decodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb");
        str = obj.decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv");
        System.out.println(str);
    }
}
