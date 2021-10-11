package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	// program to find the first snd last position of an element:
    int[] arr = {1,2,3,3,3,3,4,6,8,9};
        System.out.println(searchRange(arr,3));



    }
    static int[] searchRange(int[] nums, int target){
        int[] ans = {-1,-1};
        int start = search(nums, target,true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    static int search(int[] nums, int target, boolean isStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(target<nums[mid]){
                end = mid-1;
            }
            else if(target>nums[mid]){
                start = mid+1;
            }
            else{
                ans = mid;
                if(isStartIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
