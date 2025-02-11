package hrishik;

import java.util.Scanner;

public class CsseCheck {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String s  =  in.next();
        //trim  removes extra spaces
        //charAt returns character type
        char ch = s.trim().charAt(0);



        //WE CAN use ascii method also for this:

        //but as we know when we do any operation with char in java it type case it to integer hence we can directly compare it .
        if (ch > 'a' && ch < 'z' ){
            System.out.println("Lowercase");
        }else if(ch > 'A' && ch < 'Z' ){
            System.out.println("Upper case");
        }else{
            System.out.println("nothing");
        }

    }



}
