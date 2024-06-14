package RandomQuestions;

import java.util.Arrays;

// Move all negative numbers to beginning and positive to end with constant extra space
public class MoveNegative {
    public static void main(String[] args) {
        int  []nums = { -12, 11, -13, -5, 6, -7, 5, -3, -6};
        int e = 0 , s = 0;
        while(e < nums.length){
            if(nums[e] > 0) e++;
            else {
                int temp = nums[e];
                nums[e] = nums[s];
                nums[s] = temp;
                s++;e++;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
