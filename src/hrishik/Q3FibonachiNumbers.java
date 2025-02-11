package hrishik;

import java.math.BigInteger;
import java.util.Scanner;

public class Q3FibonachiNumbers {

    //write fiboncachi number upto the  user provided input

    public static void main(String[] args) {

        Scanner scr =  new Scanner(System.in);

        System.out.println("enter the number");
        int num  =  scr.nextInt();

        int a = 0;
        int b = 1;

        if(num == 0){
            System.out.println(0);
            return;
        }

        if( num == 1){
            System.out.println(1);
            return;
        }

        if(num> 1 ){
            System.out.println(0);
            System.out.println(1);
        }
        int i = 2;
        while (i <= num){
            int c =  a+b;
            if( c < 0 ) {
                System.out.println("system crashed...");
                break;};
            a = b;
            b = c;
            System.out.println(c);

            i++;

        }




        //for extremely large number use BigInteger so that datatype overflow should not happen

        Scanner scrs = new Scanner(System.in);

        System.out.println("Enter the big number: ");
        BigInteger bignums = scrs.nextBigInteger(); // Input remains int for practical reasons

        BigInteger as = BigInteger.ZERO;
        BigInteger bs = BigInteger.ONE;

        if (bignums.equals(BigInteger.ZERO) ){
            System.out.println(as);
            return;
        }

        if (bignums.equals(BigInteger.ONE) ) {
            System.out.println(bs);
            return;
        }

        System.out.println(as);
        System.out.println(bs);

        BigInteger is = BigInteger.TWO;
        while (is.compareTo(bignums) <= 0) {
            BigInteger c = as.add(bs); // BigInteger addition
            as = bs;
            bs = c;
            System.out.println(c);
            is = is.add(BigInteger.ONE);
        }




        //another approaches



        //exponential time complexity (O(2^n)

//        public class FibonacciRecursive {
//            public static long fibonacci(int n) {
//                if (n <= 1) {
//                    return n;
//                }
//                return fibonacci(n - 1) + fibonacci(n - 2);
//            }
//
//            public static void main(String[] args) {
//                int n = 10; // Change this to your desired N
//                System.out.println("Fibonacci " + n + " = " + fibonacci(n));
//            }
//        }





//        Recursion with Memoization (Efficient)

//import java.util.HashMap;
//
//        public class FibonacciMemoization {
//            static HashMap<Integer, Long> memo = new HashMap<>();
//
//            public static long fibonacci(int n) {
//                if (n <= 1) return n;
//                if (memo.containsKey(n)) return memo.get(n);
//
//                long result = fibonacci(n - 1) + fibonacci(n - 2);
//                memo.put(n, result);
//                return result;
//            }
//
//            public static void main(String[] args) {
//                int n = 50; // Change this to your desired N
//                System.out.println("Fibonacci " + n + " = " + fibonacci(n));
//            }
//        }
//✅ Pros: Much faster, O(n) time complexity, avoids duplicate calculations.
//❌ Cons: Uses extra memory (O(n)) for storing results.



//
//        Formula (Fastest - O(log n) with Binet’s Formula)

//        public class FibonacciFormula {
//            public static long fibonacci(int n) {
//                double sqrt5 = Math.sqrt(5);
//                double phi = (1 + sqrt5) / 2;  // Golden ratio
//                return Math.round(Math.pow(phi, n) / sqrt5);
//            }
//
//            public static void main(String[] args) {
//                int n = 50; // Change this to your desired N
//                System.out.println("Fibonacci " + n + " = " + fibonacci(n));
//            }
//        }
//✅ Pros: O(1) time complexity (fastest method).
//❌ Cons: May lose precision for very large n due to floating-point calculations.



    }
}
