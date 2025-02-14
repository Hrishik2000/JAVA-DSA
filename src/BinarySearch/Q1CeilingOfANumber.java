package BinarySearch;

public class Q1CeilingOfANumber {

    public static void main(String[] args) {

//find a number which is equal or just greater then the target. (ceil number)
        int []arr = {10,20,30,40,40,50,50,50,60,70,80,90};
        int target =91;

        int ceil = GetCeil(arr, target);


        if(ceil == -1){
            System.out.println("No such element exists");
        }else
            System.out.println(ceil);



    }


    private static int GetCeil(int[] arr, int target) {

        int left  =0;
        int right = arr.length-1;

        if(target > arr[right]) return -1 ;  // check for target which is greater then initial end of array.

        while(left<= right){

            int mid = left+ (right -left)/2;

            if(arr[mid] == target){
                return target; /// if target itself found
            }
            else if(arr[mid] < target){
                left =  mid +1;
            }else{
                right = mid -1;
            }
        }

        return arr[left]; // if target not found & while condition breaks when start >= end  hence start will be pointing to next greater element of the target.

    }
}
