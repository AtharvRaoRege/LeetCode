package LeetCodeMedium;


public class Leet11_TrappingRainWater {
    public static int maxArea(int[] height) {
        int max = 0;
        int s = 0;
        int e = height.length - 1;
        while(s < e){
            int amount = Integer.min(height[s],height[e]) * (e-s);
            max = Integer.max(amount,max);
            if(height[s] < height[e]) s++;
            else e--;
        }
        return max;
    }

    public static void main(String[] args) {
        int []arr = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
