import java.util.ArrayList;
import java.util.List;

public class GroupOfPeople {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        boolean[] processed = new boolean[groupSizes.length];
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < groupSizes.length; i++) {
            List<Integer> innerList = new ArrayList<>();
            innerList.add(i);
            if (processed[i]) {
                continue;
            }
            for (int j = i + 1; j < groupSizes.length; j++) {
                if (innerList.size() == groupSizes[i] || groupSizes[i] == 1) {
                    break;
                }
                if (groupSizes[i] == groupSizes[j] && !processed[j]) {
                    innerList.add(j);
                    processed[j] = true;
                }
            }
            result.add(innerList);
        }
        return result;
    }

    public static void main(String[] args) {
        GroupOfPeople obj = new GroupOfPeople();
        int[] groupSizes = { 3, 3, 3, 3, 3, 1, 3 };
        List<List<Integer>> result = obj.groupThePeople(groupSizes);
        System.out.println(result);
    }
}
