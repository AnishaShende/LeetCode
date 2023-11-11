import java.util.ArrayList;
import java.util.List;

public class GroupOfPeople {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        // List<List<Integer>> result = new ArrayList<>();
        // int n = groupSizes.length;
        // List<Integer>[] groups = new List[n + 1];
        // for (int i = 1; i <= n; i++) {
        //     groups[i] = new ArrayList<>();
        // }
        // for (int i = 0; i < n; i++) {
        //     groups[groupSizes[i]].add(i);
        //     if (groups[groupSizes[i]].size() == groupSizes[i]) {
        //         result.add(groups[groupSizes[i]]);
        //         groups[groupSizes[i]] = new ArrayList<>();
        //     }
        // }
        // return result;
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        String str = "";
        for (int i = 0; i < groupSizes.length; i++) {
            if (str.contains(Character.toString(groupSizes[i]))) {
                continue;
            }
            str += Integer.toString(i);
            System.out.println(str);
            innerList.add(groupSizes[i]);
            for (int j = i+1; j < groupSizes.length; j++) {
                if(groupSizes[i] == groupSizes[j]) {
                    innerList.add(groupSizes[j]);
                    str = Integer.toString(i);
                }
                if(innerList.size() == groupSizes[i]){
                    break;
                }
            }
            result.add(innerList);
        }
        return result;
    }
    public static void main(String[] args) {
        GroupOfPeople obj = new GroupOfPeople();
        int[] groupSizes = {3,3,3,3,3,1,3};
        List<List<Integer>> result = obj.groupThePeople(groupSizes);
        System.out.println(result);
    }
}
