package hrishik;

public class Q4CountingOccurances {

    public static void main(String[] args) {

        //count occurance of n form number


            // if n is given as string
            char chn = '7';
            int CharToNum =  Character.getNumericValue(chn);
            System.out.println(CharToNum);


        int n =  7; //change it accordingly
        long number =  138575787977766l;

        int count=0;

        while(number > 0 ){
            long lastDigit = number%10;
            if(lastDigit == n ){
                count ++;
            }
            number =  number/10;
        }
        System.out.println(count);




        //count occurrence when string is given
        int countOccDigit = 7;
        String str = "138575787977766";

        //convert the digit into corresponding character
        char targetChar =  Character.forDigit(countOccDigit,10); // '7'  //digit, radix (decimal -> 10 , hexadecimal -> 16 ..)

        //Converts the string into a stream of characters using str.chars().
                //str.chars() returns an IntStream where each element is the Unicode (ASCII) value of a character.
        //Filters out characters that match targetChar using .filter(ch -> ch == targetChar).
                //ch -> ch == targetChar is a lambda function that keeps only characters equal to targetChar.
               // Counts the occurrences using .count().
        //.count() returns the total number of times targetChar appears in the string.

        long CharCount = str.chars().filter(ch -> ch == targetChar).count();

        System.out.println("Occurance in string " + CharCount);


    }
}
