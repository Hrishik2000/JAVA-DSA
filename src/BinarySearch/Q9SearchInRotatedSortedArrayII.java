package BinarySearch;


//https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/

//when array contains duplicates return true / false based on element present in array or not
//{3,1,2,3,3,3,3,3}
// start = index 0 ----> 3
//mid =  index 4 ---->  3
//end  = index 8 -----> 3
//in this case we cant determine which is sorted half
// hence we shrink both the left and right & then continue;
//left ++;
//right --;

//at the end return true if element found else false


//    tc avg case  = O(Log N)
//    Worst case = O(n/2)  // in case most of the elements are duplicate


public class Q9SearchInRotatedSortedArrayII {
    public static void main(String[] args) {
        int []arr = {3,1,2,3,3,3,3,3};
        int target =  2;

        System.out.println( " is element present in array : " + searchInRotatedSortedArray1(arr, target));
    }

    private static boolean searchInRotatedSortedArray1(int[] nums, int target) {


        int low  = 0;
        int high = nums.length-1;

        while( low <= high){

            int  mid =  low + (high -low)/2;

            //if element is on mid
            if( nums[mid] == target){
                return true;
            }

            //just need to add this condition from searchIn rotated  sorted array1
            if(nums[mid] == nums[low] && nums[mid] ==  nums[high]){
                low = low +1;
                high = high -1;
                continue;
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

        return false;

    }


}


