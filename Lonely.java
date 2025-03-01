import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Lonely {

    public static ArrayList<Integer> findLonely(ArrayList<Integer> nums) {
        ArrayList<Integer> list = new ArrayList<>();
        
        if (nums == null || nums.isEmpty()) {
            return list; // Return empty list for null or empty input
        }
    
        Collections.sort(nums);
    
        // Check for the first element
        if (nums.size() == 1 || nums.get(0) + 1 < nums.get(1)) {
            list.add(nums.get(0));
        }
    
        // Check for middle elements
        for (int i = 1; i < nums.size() - 1; i++) {
            if (nums.get(i - 1) + 1 < nums.get(i) && nums.get(i) + 1 < nums.get(i + 1)) {
                list.add(nums.get(i));
            }
        }
    
        // Check for the last element
        if (nums.size() > 1 && nums.get(nums.size() - 2) + 1 < nums.get(nums.size() - 1)) {
            list.add(nums.get(nums.size() - 1));
        }
    
        return list;
    }

    public static void main(String[] args) {
    ArrayList<Integer> nums1 = new ArrayList<>(Arrays.asList(4, 3, 9, 10, 6));
    ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(1));
    ArrayList<Integer> nums3 = new ArrayList<>(Arrays.asList(10,6,5,8));
    ArrayList<Integer> nums4 = new ArrayList<>(Arrays.asList(1,3,5,3));

    System.out.println(findLonely(nums1)); // Expected: [4, 6, 9, 10]
    System.out.println(findLonely(nums2)); // Expected: [1]
    System.out.println(findLonely(nums3)); // Expected: []
    System.out.println(findLonely(nums4)); // Expected: []
}

    
}

