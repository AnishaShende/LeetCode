// 1662. Check If Two String Arrays are Equivalent

class Solution15 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String w1 = null;
        String w2 = null;
        for(String s : word1){
            w1 += s;
        }
        for(String s : word2){
            w2 += s;
        }
        if(w1.equals(w2))
            return true;
        else 
            return false;
    }
}