


//Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same.

// Since it is impossible to change the length of the array in some languages, you must instead have the result be placed in the first part of the array nums. More formally, if there are k elements after removing the duplicates, then the first k elements of nums should hold the final result. It does not matter what you leave beyond the first k elements.

// Return k after placing the final result in the first k slots of nums.

// Do not allocate extra space for another array. You must do this by modifying the input array in-place with O(1) extra memory.

// Custom Judge:

// The judge will test your solution with the following code:

// int[] nums = [...]; // Input array
// int[] expectedNums = [...]; // The expected answer with correct length

// int k = removeDuplicates(nums); // Calls your implementation

// assert k == expectedNums.length;
// for (int i = 0; i < k; i++) {
//     assert nums[i] == expectedNums[i];
// }
// If all assertions pass, then your solution will be accepted.

//NOT IN PLACE ALGORITHM IN 0(N) TIME COMPLEXITY

class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0;
        if(nums.length>0){
            int n=nums[0];
        j=1;
        int[] arr=new int[nums.length];
        arr[0]=nums[0];
             for(int i=1;i<nums.length;i++){
            if(nums[i]!=n){
                n=nums[i];
                arr[j++]=nums[i];
            }
        }
        for(int i=0;i<nums.length;i++){
        nums[i]=arr[i];
        }
       
        }
        return j;
    }
}

//IN PLACE ALGORITHM IN 0(N) TIME COMPLEXITY

class Solution {
    public int removeDuplicates(int[] nums) {
        int j=0,k=1;
        int l=nums.length;
        if(l>0){
            int n=nums[0];
            for(j=1;j<l;j++){
            if(nums[j]!=n){
                n=nums[j];
                nums[k++]=n;
            }
            }
       }
        return k;
    }
}
