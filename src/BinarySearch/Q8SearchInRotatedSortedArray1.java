package BinarySearch;



//https://leetcode.com/problems/search-in-rotated-sorted-array/
public class Q8SearchInRotatedSortedArray1 {

    public static void main(String[] args) {
        int []arr = {60,50,10,20,30,40};
        int target =  50;

        System.out.println( " element found on index: " + searchInRotatedSortedArray(arr, target));
    }

    static int searchInRotatedSortedArray(int [] nums , int target){

        int low  = 0;
        int high = nums.length-1;

        while( low <= high){

            int  mid =  low + (high -low)/2;

            //if element is on mid
            if( nums[mid] == target){
                return mid;
            }
            //find the sorted half
            else{
                 if(nums [mid] <= nums[high]){ //right half is sorted


                     //check of target on sorted right side or not
                     if( target > nums[mid] && target <= nums[high]){
                         low = mid +1;
                     }else{
                         high =  mid -1;
                     }



                 }
                 //left half is sorted
                 else{

                     if(target < nums[mid] && target>=nums[low]){
                         high =  mid -1;
                     }else{
                         low =  mid + 1;
                     }
                 }

            }

        }

        return -1;
    }

}



