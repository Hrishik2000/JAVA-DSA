package LinearSearch;

import java.sql.SQLOutput;

//A static class does not require an outer class instance.
//But it loses access to non-static members of Q6MaximumWealth.

public class Q6MaximumWealth {

    //1672. Richest Customer Wealth

//    You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
//
//    A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.
//
//
//
//    Example 1:
//
//    Input: accounts = [[1,2,3],[3,2,1]]
//    Output: 6
//    Explanation:
//            1st customer has wealth = 1 + 2 + 3 = 6
//            2nd customer has wealth = 3 + 2 + 1 = 6
//    Both customers are considered the richest with a wealth of 6 each, so return 6.

    public static void main(String[] args) {
        int [][] accounts = {{1,3},{2,1},{2,3,5}};



        //we can make inner class and can use it like this

        // Create an instance of the outer class
        Q6MaximumWealth outer = new Q6MaximumWealth();

        // Create an instance of the inner class Solution
        
        //NOTE Solution solution = new Solution(); // ❌ ERROR: Non-static inner class requires an instance of the outer class
        
        
        Solution solution = outer.new Solution();

        // Call maximumWealth function and print the result
        System.out.println("The maximum wealth is: " + solution.maximumWealth(accounts));
    }



    class  Solution {
        public int maximumWealth(int[][] accounts) {
            int maxWealth =0;
            for( int person =0 ; person< accounts.length ;person++ ){// person is row
                int CurrentPersonWealth =0;

                for(int wealth =0 ; wealth < accounts[person].length; wealth++){ //wealth is column
                    CurrentPersonWealth  += accounts[person][wealth]; // 0th person ki  jth wealths
                }

                if( maxWealth < CurrentPersonWealth ){
                    maxWealth =  CurrentPersonWealth;

                }
            }

            return maxWealth;
        }
    }


}




//Why Do We Need outer.new Solution()?
//        In Java, nested non-static classes (inner classes) require an instance of the outer class to be created before you can create an instance of the inner class.
//
//Understanding the Problem
//In your code:
//
//java
//        Copy
//Edit
//class Q6MaximumWealth {
//    class Solution {  // This is a non-static inner class
//        public int maximumWealth(int[][] accounts) {
//            // method logic
//        }
//    }
//}
//Solution is an inner class of Q6MaximumWealth.
//Inner classes are tied to an instance of the outer class, meaning:
//You cannot create an instance of Solution directly inside main().
//How to Create an Instance of an Inner Class?
//Since Solution is non-static, you must first create an instance of Q6MaximumWealth, then use that instance to create Solution.
//
//java
//        Copy
//Edit
//Q6MaximumWealth outer = new Q6MaximumWealth(); // Create outer class instance
//Solution solution = outer.new Solution(); // Create inner class instance
//This ensures that Solution is linked to a valid instance of Q6MaximumWealth.
//
//What Happens If We Don't Use outer.?
//        ❌ This will cause an error:
//java
//        Copy
//Edit
//Solution solution = new Solution(); // ❌ ERROR: Non-static inner class requires an instance of the outer class
//Java doesn't know which instance of Q6MaximumWealth should contain Solution.
//The compiler will throw an error because Solution is not static.
//Alternative: Make Solution Static
//If you don’t want to use outer., you can make Solution static:
//
//java
//        Copy
//Edit
//class Q6MaximumWealth {
//    static class Solution { // Now Solution is a static nested class
//        public int maximumWealth(int[][] accounts) {
//            // method logic
//        }
//    }
//}
//Now, you can create an instance directly, without outer.new:
//
//java
//        Copy
//Edit
//Solution solution = new Solution(); // ✅ Works because Solution is static now
//Trade-off:
//
//A static class does not require an outer class instance.
//But it loses access to non-static members of Q6MaximumWealth.
//        Summary
//Approach                               	Requires outer.new Solution()?	Can access outer class members?
//Inner Class (Non-static, your original code)	✅ Yes                      	✅ Yes
//Static Inner Class (static class Solution)	❌ No	                        ❌ No (Loses access to Q6MaximumWealth members)
