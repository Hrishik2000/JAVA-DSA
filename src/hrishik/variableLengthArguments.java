package hrishik;

import java.util.Arrays;

public class variableLengthArguments {

    public static void main(String[] args) {
        fun(1234,5,6,7,7,88,8,8,89,9,9,0,6,900,000, -1,0,7,0,0);


        fun(1,2,"hrishik" ,"sahu");
    }

    static void fun(int ...v){ // this will be trated as asn array of int, we can change datatype to String or any other depending on requirements
        System.out.println(v[0]);
        System.out.println(Arrays.toString(v));
    }

//    static int fun(int ...v){  // return type change will creates error in function overloading
//        System.out.println(v[0]);
//        System.out.println(Arrays.toString(v));
//        return v[0];
//    }

    static void fun(int a , int b , String ...s){// variable argument paramertes used at last of arguments
        System.out.println(a + " " + b +" "+ Arrays.toString(s));
    }
}
