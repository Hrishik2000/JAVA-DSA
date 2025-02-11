package LinearSearch;

import java.util.Arrays;

public class Q4SearchIn2Darray {


    //return row & col of element found else return  {-1,-1}
    public static void main(String[] args) {

        int arr2D[][] = {
                {
                10,20,30},
                {40,50,60},
                {70,80,90}
            };
        int target =  90;


        int[] check = findElement(arr2D,target);

        System.out.println(Arrays.toString(check));

        System.out.println(max(arr2D));
    }

    private static int[] findElement(int[][] arr2D, int target) {

        for( int row  =0; row < arr2D.length ;row ++){
            for(int col =0;col < arr2D.length ;col ++){
                if(arr2D[row][col] == target){


                    //return a 1d array
                    return new int []{row,col};
                }
            }
        }
        return new int []{-1,-1};
    }


    private static int max(int[][] arr2D){

    int max =  Integer.MIN_VALUE;


        for( int row  =0; row < arr2D.length ;row ++){
            for(int col =0;col < arr2D.length ;col ++){
                if(arr2D[row][col] > max){
                    max = arr2D[row][col];

                }
            }
        }
        return max;
    }
}
