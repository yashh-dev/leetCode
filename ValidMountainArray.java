// Given an array of integers arr, return true if and only if it is a valid mountain array.

// Recall that arr is a mountain array if and only if:

// arr.length >= 3
// There exists some i with 0 < i < arr.length - 1 such that:
// arr[0] < arr[1] < ... < arr[i - 1] < arr[i]
// arr[i] > arr[i + 1] > ... > arr[arr.length - 1]

 

// Example 1:

// Input: arr = [2,1]
// Output: false



class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean flag=true;
        if(arr.length<3){
            return false;
        }
        int max=0;
        for(int i=1;i<arr.length;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        if(max==0 || max==arr.length-1){
            return false;
        }
        for(int i=0;i<arr.length-1;i++){
        if(i<max){
            if(arr[i]>arr[i+1] || arr[i]==arr[i+1]){
                return false;
            }
        }else if(arr[i]==arr[i+1]){
            return false;
        }else if(i==max){
            continue;
        }
            else{
            if(arr[i]<arr[i+1] ){
                return false;
            }
        }
        }
        return true;
    }
}
