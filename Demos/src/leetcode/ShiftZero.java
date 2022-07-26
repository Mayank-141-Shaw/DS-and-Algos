package leetcode;

public class ShiftZero {
	public void moveZeroes(int[] nums) {
        int zero=0;
        int i=0, n = nums.length;
        int pos=0;
        while(i<n){
            if(nums[i] == 0){
                zero++;
            }else{
                nums[pos] = nums[i];
                pos++;
            }
            i++;
        }
        for(int k=pos; k<n; k++){
            nums[k] =0;
        }
    }
}
