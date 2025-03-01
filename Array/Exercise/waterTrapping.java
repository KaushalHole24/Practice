package Array.Exercise;

public class waterTrapping {
    public static int trappedWater(int barHeights[]){
        int n = barHeights.length;
        int waterLevel;
        int trappedWater = 0;

        int leftMax[] = new int[n];
        leftMax[0] = barHeights[0];
        int rightMax[] = new int[n];
        rightMax[n-1] = barHeights[n-1];

        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(leftMax[i-1], barHeights[i]);
        }

        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], barHeights[i]);
        }

        for(int i=0; i<n; i++){
            waterLevel = Math.min(leftMax[i], rightMax[i]);
            trappedWater += waterLevel - barHeights[i];
        }

        return trappedWater;
    }
    public static void main(String[] args) {
        int barHeights[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Total trapped water is "+trappedWater(barHeights)+" units.");
    }
}
