package Array.Exercise;

public class unique {
    public static boolean check(int nums[]){
        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,1,5,6};
        boolean arr = check(nums);
        System.out.println(arr);
    }
}
