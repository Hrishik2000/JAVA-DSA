package BinarySearch;

public class Basics {

    public static void main(String[] args) {

        //best case o1

        //total no of comparisons in worst case is log(n);

//     level 1   n/2^0 (no exclusion of any part of array)
//            level 2 -----> n/2^1
//                level 3 ---> n/2^2
//                level kth ---->n/2^k  (at the end there is 1 element remaining)
//                    1 = n/2^k
//
//                n = 2^k
//        taking log both side
//                log(n) - log (2^k)
//                        log n =  k log 2
//            k = log(n)/ log(2)
//                    k = log(n) base 2
//
//            //ignoring constsnts
//        worst case time complexity is O(n)




        //normal binary search  ---assuming array is sored in ASC order.

//
//        int[] arr = {2,4,6,6,8,9,10};
//        int target =  9;
//
//        int left =0;
//        int right = arr.length-1;
//
//        boolean check =  false;
//        while(left<=right){
//
//            //int mid  = (left+right)/2;
//            int mid = left + (right - left) / 2; //prevents integer overflow
//
//
//            if(arr[mid] == target){
//                check=  true;
//                System.out.println("Element found at index: "+ mid);
//                break;
//
//            }else if( arr[mid] < target){
//                left =  mid +1;
//
//            }else{
//                right =  mid -1;
//            }
//
//
//
//        }
//
//        if(!check) System.out.println("element not found !");



//order Agnostic binary search   (works with ASC order / DEC order sorted array)

        int[] arr = {2,4,6,6,8,9,10};
        //int[] arr = {10,9,8,6,6,4,2};
        int target =  9;

        int left =0;
        int right = arr.length-1;

        boolean check =  false;

        boolean isAsc  = arr[left] < arr[right];

            while(left<=right) {

                //int mid  = (left+right)/2;
                int mid = left + (right - left) / 2; //prevents integer overflow


                if (arr[mid] == target) {
                    check = true;
                    System.out.println("Element found at index: " + mid);
                    break;

                }
                if(isAsc){ //if asc

                    if (arr[mid] < target) {
                        left = mid + 1;


                    } else {
                        right = mid - 1;


                    }
                }else{ // if dec
                    if (arr[mid] < target) {
                        right = mid - 1; // search in left space as target is greater then current element & can be found in LHS if mid (desc sorted array


                    } else {
                        left = mid + 1;

                    }
                }



            }
        if(!check) System.out.println("element not found !");



    }



}
