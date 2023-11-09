// 500. Keyboard Row
import java.util.*;

class KeyboardRow {
    public String[] findWords(String[] words) {
        String[] onerow = new String[words.length];
        String r1 = "qwertyuiop";
        String r2 = "asdfghjkl";
        String r3 = "zxcvbnm";
        int temp = 0;
        char c;
        int count = 1;
        int index = 0;
        for (int i = 0; i < words.length; i++) {
            c = words[i].charAt(0);
            if(r1.contains(Character.toString(c).toLowerCase())){
                temp = 1;
            }
            else if(r2.contains(Character.toString(c).toLowerCase())){
                temp = 2;
            }
            else{
                temp = 3;
            }
            for (int j = 1; j < words[i].length(); j++) {
                if(temp == 1){
                    if(r1.contains(Character.toString(words[i].charAt(j)))){
                        count ++;
                    }
                    else{
                        break;
                    }
                }
                else if(temp == 2){
                    if(r2.contains(Character.toString(words[i].charAt(j)))){
                        count ++;
                    }
                    else{
                        break;
                    }
                }
                else{
                    if(r3.contains(Character.toString(words[i].charAt(j)))){
                        count ++;
                    }
                    else{
                        break;
                    }
                }
            }
            if(count == words[i].length()){
                onerow[index] = words[i];
                index ++;
            }
            count = 1;
        }
        return onerow;
    }

    public static void main(String[] args) {
        KeyboardRow obj = new KeyboardRow();
        String arr[] = { "Hello", "Alaska", "Dad", "Peace" };
        String[] arr2 = obj.findWords(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
    }
}