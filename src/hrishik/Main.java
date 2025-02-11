package hrishik;

import java.io.File;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) {
        Scanner scr =  new Scanner(System.in);

        int a  =  scr.nextInt();
        System.out.println(a);
        scr.nextLine();
        System.out.println(scr.nextLine());

        Integer i = 23;
        System.out.println(i.byteValue());
        System.out.println(i.hashCode());
        System.out.println(i.equals(26));

        int num1 = scr.nextInt();
        int num2 =  scr.nextInt();
        System.out.println(num2+num1);





    }
}