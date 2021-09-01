// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

// Note that you must do this in-place without making a copy of the array.

 

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]



class Solution {
    public void moveZeroes(int[] nums) {
        int l=nums.length;
        int n;
        int k=0;
        int count=0;
        if(l>=2){
        System.out.println(count);
        for(int i=0;i<l;i++){
           if(nums[i]!=0){
               n=nums[i];
               nums[i]=0;
               nums[k++]=n;
            }
        }
        }
    }
}
