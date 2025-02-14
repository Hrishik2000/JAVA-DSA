package BinarySearch;
// 34. Find First and Last Position of Element in Sorted Array

import java.util.Arrays;

//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
public class Q4FirstAndLastOccuranceOfElement {

    public static void main(String[] args) {

        int arr[] = {10,20,30,30,30,50,50,60,60,607};
        int target = 30;
        Solution1 s1 =  new Solution1();
        System.out.println(Arrays.toString(s1.searchRange(arr,target)));
    }
}



class Solution1 {
    public int[] searchRange(int[] nums, int target) {


        int start = 0;
        int end = nums.length-1   ;

        int firstocc = -1;
        int lastocc = -1;

        while(start<=end){

            int mid =  start + (end - start)/2;

            if(nums[mid] == target){
                firstocc = mid;
                end = mid - 1;

            }

            else if(nums[mid] < target)
            {
                start = mid+1;
            }
            else{
                end = mid-1;
            }

        }

        start = 0;
        end = nums.length-1;
        while(start<=end){

            int mid =  start + (end - start)/2;

            if(nums[mid] == target){
                lastocc = mid;
                start = mid+1;

            }else if(nums[mid] < target){
                start = mid+1;

            }else{
                end = mid-1;
            }

        }


        return new int []{firstocc,lastocc};




    }
}


