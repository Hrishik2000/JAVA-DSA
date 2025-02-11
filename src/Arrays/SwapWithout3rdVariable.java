package Arrays;

public class SwapWithout3rdVariable {


    public static void main(String[] args) {
        int start =0;
        int end =  10;


        // Swap without a third variable using addition & subtraction
        start = start + end;
        end = start - end; // Now arr[end] has the original arr[start]
        start = start - end; // Now arr[start] has the original arr[end]

        System.out.println("ADD_SUB---->"+ " Start " + start + " End " + end);

        //XOR logic (replace + -  with ^

        start = start ^ end;
        end = start ^ end;
        start = start ^ end;



//        First Operation (^)
//
//        Stores the combined information of both numbers in arr[start].
//                Second Operation (^)
//
//        Extracts the original arr[start] value from arr[start] ^ arr[end].
//                Third Operation (^)
//
//        Extracts the original arr[end] value from arr[start] ^ arr[end].



// XOR swap is an elegant trick, but not always practical.
//✔️ Use a temporary variable for clarity, or arithmetic swap for better readability.



        System.out.println("XOR---->"+ " Start " + start + " End " + end);



    }
}
