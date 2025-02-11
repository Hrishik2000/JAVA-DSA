package hrishik;

import java.util.Scanner;

public class Q6IsPrime {

    public static void main(String[] args) {
        System.out.println("enter the number to check");
        Scanner in  = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(isPrime(num));
        in.close();
    }

    private static boolean isPrime(int num) {
        if(num <=1){
            return false;
        }



//The loop runs till i * i <= num instead of i <= num/2 or i < num, which is optimal.

            for(int i = 2 ; i*i<=num;i++){
                if(num%i == 0){
                    return false;
                }
            }

        return true;
    }
}
