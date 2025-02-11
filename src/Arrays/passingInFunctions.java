package Arrays;

import java.util.Arrays;

public class passingInFunctions {

    public static void main(String[] args) {
        //arrays are mutable in java & string are immutable
        int arr[] = {1,2,3,4};

        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4]
        change(arr);
        System.out.println(Arrays.toString(arr));//[99, 2, 3, 4]


    }
    //nums also refering to the same arr object hence it will mutate the original array
    private static void change(int [] nums) {
        nums[0] = 99; //
    }



}
