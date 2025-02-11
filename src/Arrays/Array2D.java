package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array2D {


    public static void main(String[] args) {

        //2d array


        //note
        //1. coulumns decleration is not maindatory
        //int [][] arr = new int [3][3];
        //int [][] arr = new int [3][];


//    int [][] brr = {
//            {1,2,3},
//            {4,5,6},
//            {7,8,9}
//        };


        //variable col length array
        int [][] arr =  {
                {1,2},
                {3,5,6},
                {6,1,1,4}
        };


        //printing of 2d array
        for (int row = 0 ;row < arr.length ;row ++){
            for(int col =0 ; col < arr[row].length;col ++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();

        }



        //printing via enhanced for loop
        for( int []i : arr){
            System.out.println(Arrays.toString(i));
        }


        //input of 2d array;
        System.out.println("Enter elements");
        Scanner in =  new Scanner(System.in);
        int [][] brr = new int[3][3];
        for(int row  = 0; row< brr.length ;row++){
            for (int col = 0 ;col < brr[row].length; col++){
                brr[row][col] = in.nextInt();
        }
        }


        for(int row  = 0; row< brr.length ;row++){
            for (int col = 0 ;col < brr[row].length; col++){
                System.out.print (brr[row][col] + " ");
            }
            System.out.println();
        }




        // ** Fix: Consume the leftover newline before jagged array input **
        in.nextLine();




//        code is not "stopping" for jagged array input because of an issue with how the Scanner reads input. It seems like your previous input for the brr 2D array is consuming extra integers, which affects the jagged array input.
//
//🔍 What's Causing the Issue?
//        Scanner Issue (in.nextInt())
//        The nextInt() method only reads integers and leaves behind newline (\n) characters in the buffer.
//        When you enter all numbers in one line, extra numbers might remain in the buffer for the jagged array input.
//        Extra Input for brr
//        Your input for the 2D array brr is consuming more numbers than expected.
//        The scanner takes additional inputs but does not wait again for jagged array input, leading to incorrect data.
//✅ Fix: Clear the Scanner Buffer
//        Add in.nextLine(); after taking input for brr to consume any extra newlines before proceeding to the jagged array.






        //input 2d jagged array
        int[][] jaggedArray = new int[3][];  // 3 rows, but column sizes are undefined

        // Assign different column sizes to each row
        jaggedArray[0] = new int[2];  // Row 1 has 2 columns
        jaggedArray[1] = new int[3];  // Row 2 has 3 columns
        jaggedArray[2] = new int[1];  // Row 3 has 1 column

        // Taking input
        System.out.println("Enter elements for the jagged array:");
        for (int row = 0; row < jaggedArray.length; row++) {
            for (int col = 0; col < jaggedArray[row].length; col++) {
                jaggedArray[row][col] = in.nextInt();
            }
        }

        // Displaying the jagged array
        System.out.println("The jagged array is:");
        for (int row = 0; row < jaggedArray.length; row++) {
            for (int col = 0; col < jaggedArray[row].length; col++) {
                System.out.print(jaggedArray[row][col] + " ");
            }
            System.out.println();  // Move to next line after each row
        }



    in.close();
    }
}
