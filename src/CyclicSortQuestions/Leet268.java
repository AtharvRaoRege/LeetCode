package CyclicSortQuestions;

public class Leet268 {
    public static void swap(int [] nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int idx = nums[i];
            if(idx < nums.length && nums[i] != nums[idx]) swap(nums, i, idx);
            else i++;
        }
        for (int j = 0; j < nums.length; j++) {
            if(j != nums[j]) return j;
        }
        return nums.length;
    }

    public static void main(String[] args) {

    }
}
