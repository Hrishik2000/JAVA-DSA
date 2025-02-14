package BinarySearch;

public class Q5FindElementInInfiniteArray {


    //https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/

    public static void main(String[] args) {

        int arr[] = {1,2,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,191,20};
        int target = 20;

        System.out.println(findRangeAndReturnAns(arr,target));



    }

    public static int findRangeAndReturnAns(int arr[] , int target){
        //initial start end range
        int start = 0;
        int end = 1;

        //condition for target to lie into range
        while(target > arr[end]){
            int newStart = end+1; //this is my new start

            //double the search range box
            //end =  previousEnd + SizeOfOldBox * 2
            end =  end + (end - start + 1)*2;

            // Prevent going out of bounds we have to use .length here
            if (end >= arr.length) {
                end = arr.length - 1;
                break;
            }

            start =  newStart;

        }

        // calling the binary search method & returning its outcome.
            return  binarySearch(arr ,target , start , end);

    }



    public  static int binarySearch(int [] arr , int target, int start , int end){



        while(start<=end){
            int mid   = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid]> target) {
                end =  mid -1;
            }else{
                start  = mid +1;
            }

        }
        return -1;

    }
}




//if you dont even want to use .length for checking array outof bound exception use try catch block for exception handeling

//package BinarySearch;
//
//public class Q5FindElementInInfiniteArray {
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
//        int target = 10;
//
//        int result = findRangeAndReturnAns(arr, target);
//        System.out.println("Target found at index: " + result);
//    }
//
//    public static int findRangeAndReturnAns(int arr[], int target) {
//        int start = 0;
//        int end = 1;
//
//        // Expanding search range exponentially
//        while (true) {
//            try {
//                if (arr[end] >= target) {
//                    break;  // Stop if target is within range
//                }
//                int newStart = end + 1;
//                end = end + (end - start + 1) * 2; // Double the range
//                start = newStart;
//            } catch (Exception e) {
//                // If we go out of bounds, assume the last accessible index
//                break;
//            }
//        }
//
//        return binarySearch(arr, target, start, end);
//    }
//
//    public static int binarySearch(int[] arr, int target, int start, int end) {
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//
//            try {
//                if (arr[mid] == target) {
//                    return mid;
//                } else if (arr[mid] > target) {
//                    end = mid - 1;
//                } else {
//                    start = mid + 1;
//                }
//            } catch (Exception e) {
//                // If mid is out of bounds, adjust end to a safe limit
//                end = mid - 1;
//            }
//        }
//        return -1;
//    }
//}


