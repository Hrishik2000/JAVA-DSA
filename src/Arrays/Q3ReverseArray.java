package Arrays;

import java.util.Arrays;

public class Q3ReverseArray {

    public static void main(String[] args) {

        int arr[] = {1,2,3,5,7};

        reverse(arr);
        System.out.println(Arrays.toString(arr));


    }

    private static void reverse(int[] arr) {

        int start = 0;
        int end  = arr.length-1;

        while( start<end){

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }


}
