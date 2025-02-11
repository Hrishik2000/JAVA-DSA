package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array1 {

    //input array

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arr[] =  new int [5];

        System.out.println("enter the elements");
        //DYNAMIC input of array
        for(int i = 0;i< arr.length;i++){
            arr[i] = in.nextInt();
        }

        //print array vua for each loop
        for(int i : arr){
            System.out.print(i+ " ");
        }

        //System.out.println(arr[5]); //ArrayIndexOutOfBoundsException:
        //System.out.println(arr[-1]); //ArrayIndexOutOfBoundsException:


        //array of objects
        System.out.println("entr 5 string values");
        String s[] = new String[4];

//he enhanced for loop (for-each loop) in Java does not work for taking input because
// it is designed only for iterating over collections, arrays, or iterable objects.
// You cannot modify elements within the loop, and it does not work with Scanner input.

//        for(String i : s){
//            i = in.next();
//        }


        for(int i = 0 ;i< s.length ; i++){
            s[i]  = in.next();
        }
        System.out.println(Arrays.toString(s));
        s[1] = "hrishik"; //we are modifying the value of s[1] ref variable
        System.out.println(s[1]); //hrishik // original varibale got changed

    }
}
