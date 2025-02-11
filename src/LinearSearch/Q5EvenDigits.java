package LinearSearch;

public class Q5EvenDigits
{
    //on leetcode

    //1295. Find Numbers with Even Number of Digits

    public static void main(String[] args) {

        int [] arr  = {12,234,14,-13};
        Solution s =  new Solution();

        System.out.println(s.findNumbers(arr));
        System.out.println(s.findNumbers2(arr));


    }




}


class Solution {
    public  int findNumbers(int[] nums) {

        int count =0;

            //FAST but not optimized
        for(int i =0 ;i < nums.length ;i++){

            //if negative no is there ex -123 convert it positive first ( -123 * -1 = +123) ;
            if(nums[i] <0){
                nums[i] = nums[i] *  -1;

            }

            String SrtingRep = Integer.toString(nums[i]); //integer class used to convert integer to string conversion . and for array elements use Array class before toString method
            if(SrtingRep.length() % 2 ==0){
                count ++;
            }
        }

            return count;

    }





//    **digits(num) runs in O(1)** because Math.log10(num)` is a constant-time operation.
//    Loop runs in O(n) for n elements.
//    Overall Complexity: O(n), which is efficient.

    public  int findNumbers2(int[] nums) {

        int count =0;
        for(int  i : nums){
             if( digit(i) % 2 ==0){
                 count++;
             };
        }

        return count;
    }


    int digit(int num){
        //if negative no is there ex -123 convert it positive first ( -123 * -1 = +123) ;
        if(num < 0) {
            num = num * -1;
        }

        int digitCount =  (int)Math.log10(num) + 1; //formula to find number of digit in base 10 decimal  , log2(num) when need to find number of digit in base 2 Binary

        return digitCount;

    }


}
