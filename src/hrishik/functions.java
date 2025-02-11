package hrishik;

import java.sql.SQLOutput;
import java.util.Arrays;

public class functions {



    //NO pass by ref. in java
    // premetive data types values are passed to function
    // non premetive  Object/string/array  copy of the value of referance variables are passed. to funnctions


    public static void main(String[] args) {
        String name = "hrishik";
        chnagename(name);
        System.out.println(name);
        name = chnagenameReturn(name); // this will change name as value is returned fromt the function
        System.out.println(name);


        int a = 10;
        int b = 20;
        swap(a,b); //number wont swapped as in java pass by value is present
        System.out.println("a-> " + a +" " + "b -> " + b+ " ---value not swap due to pass by value");



        int arr [] = {1,2,3,4,6};
        changeArr(arr); //this will change 0th index value in main array as referance copy is passed
        //System.out.println(arr[-1]); //ArrayIndexOutOfbOUNDeXCEPTION  //runtime exception
        System.out.println(Arrays.toString(arr));

    }

    private static void changeArr(int[] srr) {

        srr[0] = 100;


    }

    private static void swap(int a, int b) {
        int temp =  a;
        a=b;
        b= temp;

    }

    private static void chnagename(String naam) {
        naam = "raj--nameNot Change as string is immutable"; //here we are not modifying the string we are creating a new object
    }
    private static String chnagenameReturn(String naam) {
        return  naam = "raj"; //here we are not modifying the string we are creating a new object & returning the same
    }




}
