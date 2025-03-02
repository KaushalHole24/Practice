import java.util.Stack;

public class TrappingWater {

    public static void trappedWater(int[] height){

        Stack<Integer> stack = new Stack<>();
        int waterTrapped = 0;

        for(int i=0; i<height.length; i++){
            while(!stack.isEmpty() && height[i] > height[stack.peek()]){
                int bottom = stack.pop();
                if(stack.isEmpty()){
                    break;
                }
                int left = stack.peek();
                int distance = i - left - 1;
                int waterHeight = Math.min(height[left], height[i]) - height[bottom];
                waterTrapped += distance * waterHeight;
            }
            stack.push(i);
        }
        System.out.println("Total water Trapped is :"+waterTrapped);
        
    }

    public static void main(String[] args) {
        int[] height = {4, 2, 0, 3, 2, 5};
        trappedWater(height);
    }
}
