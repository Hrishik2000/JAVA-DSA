package hrishik;

import java.util.Scanner;

public class typeCasting {

    public static void main(String[] args) {

        Scanner scr =  new Scanner(System.in);

        //type conversion (brodning conversion)
        float fs =  scr.nextInt();

        //type casting (narrowing conversion
        int n =  (int)scr. nextFloat();
        System.out.println(fs);
        System.out.println(n);

        //automatic type promotion in expression
        int a  =  257;
        byte by = (byte)(a); //adding remainder of max value when divided by 256
        //257%256 = 1
        System.out.println("by value:"+ by);


        //example of automatic type prom.
        byte x = 40;
        byte y = 50;
        byte z = 100;
        // 40 * 50  =  2000 which easily exceeds the range of byte (byte * byte gives byte) hence intermediate result of multiplication is stored in integer by default. by java
        int g  =  x * y / z ;
        System.out.println(g);


        // exp
        byte e  =  40;
        //e = e / 2; //after  any operation (multiplication/ add / sub / div) its integer now , it cant be assigned to byte
        e = (byte)(e / 2); //solution (explicitly typecast to byte
        System.out.println(e);




        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f * b) + (i / c) + (d * s);
        //float + int  +  double = double
        System.out.println((f * b) +" " + (i / c) +  " " + (d * s));
        System.out.println(result);


    }
}
