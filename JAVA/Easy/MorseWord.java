
// 804. Unique Morse Code Words
import java.util.*;

class MorseWord {

    public int uniqueMorseRepresentations(String[] words) {
        // int count = 1;
        // int different = words.length;
        String[] morse_words = new String[words.length];
        // int[] different = new int[words.length];
        // int k = 1, l = 1;
        for (int i = 0; i < words.length; i++) {
            morse_words[i] = convertToMorse(words[i]);
        }
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < morse_words.length; i++) {
            set.add(morse_words[i]);
            // System.out.println(morse_words[i]);
            // int j = 0;
            // for (j = 0; j < i; j++) {
            // if (morse_words[i] == morse_words[j]) {
            // break;
            // }
            // if(morse_words[i].equals(morse_words[j])){
            // different[i] = k;
            // different[j] = l;
            // }
            // if(different[words.length-1] != 0){
            // count = k;
            // return count;
            // }
            // if ((morse_words[i].equals(morse_words[j]))) {
            // break;
            // } else {
            // count++;
            // }
            // }
            // if (i == j) {
            // count++;
            // }
            // k++;
            // l++;
        }
        // System.out.println(morse_words[morse_words.length-1]);
        // if (count == 0) {
        // count = 1;
        // }
        return set.size();
    }

    String convertToMorse(String str) {
        String morse = "";
        char c;
        String[] morse_code = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..",
                "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.." };
        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            switch (c) {
                case 'a':
                    morse += morse_code[0];
                    break;
                case 'b':
                    morse += morse_code[1];
                    break;
                case 'c':
                    morse += morse_code[2];
                    break;
                case 'd':
                    morse += morse_code[3];
                    break;
                case 'e':
                    morse += morse_code[4];
                    break;
                case 'f':
                    morse += morse_code[5];
                    break;
                case 'g':
                    morse += morse_code[6];
                    break;
                case 'h':
                    morse += morse_code[7];
                    break;
                case 'i':
                    morse += morse_code[8];
                    break;
                case 'j':
                    morse += morse_code[9];
                    break;
                case 'k':
                    morse += morse_code[10];
                    break;
                case 'l':
                    morse += morse_code[11];
                    break;
                case 'm':
                    morse += morse_code[12];
                    break;
                case 'n':
                    morse += morse_code[13];
                    break;
                case 'o':
                    morse += morse_code[14];
                    break;
                case 'p':
                    morse += morse_code[15];
                    break;
                case 'q':
                    morse += morse_code[16];
                    break;
                case 'r':
                    morse += morse_code[17];
                    break;
                case 's':
                    morse += morse_code[18];
                    break;
                case 't':
                    morse += morse_code[19];
                    break;
                case 'u':
                    morse += morse_code[20];
                    break;
                case 'v':
                    morse += morse_code[21];
                    break;
                case 'w':
                    morse += morse_code[22];
                    break;
                case 'x':
                    morse += morse_code[23];
                    break;
                case 'y':
                    morse += morse_code[24];
                    break;
                case 'z':
                    morse += morse_code[25];
                    break;
            }
        }
        return morse;
    }

    public static void main(String[] args) {
        MorseWord obj = new MorseWord();
        // String[] arr = { "cbrl", "cdfl", "wvtj", "wvkm", "anuyt" };
        String[] arr = { "gin", "zen", "gig", "msg" };
        System.out.println(obj.uniqueMorseRepresentations(arr));
    }
}