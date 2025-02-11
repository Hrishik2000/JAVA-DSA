package hrishik;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q7ArmstrongNos {

    //check not is armstrong no or not (3 digit max)

    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner in  = new Scanner(System.in);
        int num = in.nextInt();
        in.close();
        System.out.println(isArmstrong(num));


        //printing all armstrong no untill 1000;
        for(int i =0;i<= 1000 ;i++){
            if(isArmstrong(i)){
                System.out.println(i+ " ");
            }
        }

    }



    static boolean isArmstrong(int num){
        int orgNo = num;
        int sum =0;
        while(num >0){
            int rem =  num % 10;
            num = num/10;
            sum =  sum + rem*rem*rem;
        }

        return sum ==orgNo;
    }





    //optimized code

    //any count of digit armstrong no.

//    static boolean isArmstrong(int num) {
//        int original = num;
//        int sum = 0;
//        int digits = (num == 0) ? 1 : (int) Math.log10(num) + 1; // Count digits dynamically
//
//        while (num > 0) {
//            int rem = num % 10;
//            sum += Math.pow(rem, digits); // Calculate rem^digits
//            num /= 10;
//        }
//
//        return sum == original; // Directly return boolean result
//    }

    //Supports numbers of any length, not just 3-digit numbers.
    // ✅ Uses Math.pow(rem, digits) instead of hardcoded rem * rem * rem.
    //✅ Computes the digit count dynamically using Math.log10(num) + 1.



}

