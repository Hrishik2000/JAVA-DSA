////What is Radix?
////Radix (or base) is the number of unique digits (including zero) used to represent numbers in a particular number system.
////
////Common Radix Values:
////Radix (Base)	Number System	Digits Used
////2	Binary	0, 1
////8	Octal	0–7
////10	Decimal	0–9
////16	Hexadecimal	0–9, A–F
////Radix in Java
////In Java, radix is used in various methods to convert numbers between different bases.
////
////1️⃣ Character.forDigit(int digit, int radix)
////Converts a digit into its character representation in the given radix.
////Example:
//
////char ch = Character.forDigit(10, 16);
////System.out.println(ch); // Output: 'a' (10 in base 16)
////🔹 10 in base-16 (hexadecimal) is represented as 'a'.
////2️⃣ Integer.parseInt(String s, int radix)
////Converts a string number in the given radix to an integer.
////Example (Binary to Decimal):
//
//int num = Integer.parseInt("1010", 2);
//System.out.println(num); // Output: 10
//🔹 "1010" in base-2 (binary) is 10 in decimal.
//3️⃣ Integer.toString(int num, int radix)
//Converts an integer to a string representation in the given radix.
//Example (Decimal to Hexadecimal):
//
//String hex = Integer.toString(255, 16);
//System.out.println(hex); // Output: "ff"
//🔹 255 in base-16 (hexadecimal) is "ff".
//Example: Convert a Number to Different Bases
//
//public class RadixExample {
//    public static void main(String[] args) {
//        int num = 255;
//
//        System.out.println("Binary: " + Integer.toString(num, 2));  // 11111111
//        System.out.println("Octal: " + Integer.toString(num, 8));   // 377
//        System.out.println("Hex: " + Integer.toString(num, 16));    // ff
//    }
//}
//🔹 255 in different bases:
//Binary: 11111111
//Octal: 377
//Hex: ff
//Let me know if you need more examples! 🚀
//
//
//
//
//
//
//
//You said:
//char n = '7';
//need to convert it in digit
//
//
//
//You can convert a character (like '7') to an integer (digit 7) using different methods in Java.
//
//1️⃣ Using Character.getNumericValue() ✅ (Best for all cases)
//
//char n = '7';
//int digit = Character.getNumericValue(n);
//System.out.println(digit); // Output: 7
//🔹 Works for any valid numeric character, including '0' to '9' and even hexadecimal characters ('A' → 10, 'F' → 15).
//
//2️⃣ Using Character.digit() ✅ (With Radix Support)
//
//char n = '7';
//int digit = Character.digit(n, 10); // 10 is the decimal (base-10) system
//System.out.println(digit); // Output: 7
//🔹 If the character is not a digit, it returns -1.
//
//3️⃣ Using ASCII Subtraction (For '0'–'9' only)
//
//char n = '7';
//int digit = n - '0';
//System.out.println(digit); // Output: 7
//🔹 Fastest method but only works for '0' to '9'.