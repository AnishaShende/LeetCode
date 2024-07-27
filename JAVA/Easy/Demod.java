import java.util.List;

public class Demod {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (int i = 0; i < items.size(); i++) {
            if (ruleKey.equals("type") && items.get(0).equals(ruleValue)) {
                count++;
            } else if (ruleKey.equals("color") && items.get(1).equals(ruleValue)) {
                count++;
            } else {
                count++;
            }
        }
        return count;
    }
}
