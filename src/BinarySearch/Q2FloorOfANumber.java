package BinarySearch;

public class Q2FloorOfANumber {

    public static void main(String[] args) {

//find a number which is equal or just smaller then the target. (floor number)
        int []arr = {10,20,30,40,40,50,50,50,60,70,80,90};
        int target =98;

        int floor = GetFloor(arr, target);

        if(floor == -1){
            System.out.println("No such element exists");
        }else
            System.out.println(floor);



    }


    private static int GetFloor(int[] arr, int target) {

        int left  =0;
        int right = arr.length-1;

        if(target < arr[0]) return -1 ;  // check for target which is smaller then  initial start of array.

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

        return arr[right]; // if target not found & while condition breaks when start >= end  hence end will be pointing to next smaller element of the target.

    }
}
