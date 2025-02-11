package Arrays;

import java.util.Arrays;

public class Q1SwapElementInArray {

   public static void  swaparr(int [] arr , int index1,int index2){
        int temp =  arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;

    }

    public static void main(String[] args) {

        int[] arr = {10,20,30,40};
        int index1 = 0;
        int index2 = 1;
        swaparr(arr,index1,index2);
        System.out.println(Arrays.toString(arr));
    }

}
