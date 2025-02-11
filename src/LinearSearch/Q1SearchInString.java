package LinearSearch;

import java.util.Arrays;

public class Q1SearchInString {

    public static void main(String[] args) {
        String str = "Hrishik";
        char target = 'o';
        System.out.println(stringSearch(str , target));
        System.out.println(stringSearch2(str , target));
    }


    private static boolean stringSearch2(String str, char target) {

        if(str.length() ==0){
            return false;
        }
        System.out.println(str.toCharArray());// Hrishik
        System.out.println(Arrays.toString(str.toCharArray()));//[H, r, i, s, h, i, k]



        // This prints the char array incorrectly (because Java does not override toString() for arrays)
        System.out.println(str.toCharArray()); // ❌ Unexpected output (memory address)

        // This properly converts the char array to a readable format
        System.out.println(Arrays.toString(str.toCharArray())); // ✅ Output: [H, r, i, s, h, i, k]

        // Correct way to print each character using a loop
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            System.out.print(c + " "); // ✅ H r i s h i k
        }




        //to use for each loop we require a char array
        // hence converting string into character array
        for( char ch :  str.toCharArray()){
            if(ch ==target){
                return true;
            }

        }
        return false;
    }

    private static boolean stringSearch(String str, char target) {

        if(str.length() == 0){
            return false;
        }
        for(int i =0;i<str.length() ;i++){
            if(target == str.charAt(i)) return true;

        }
        return false;
    }


}




