package Arrays;

import java.util.Arrays;

public class ArrayBasics {

    public static void main(String[] args) {

        //syntax
        //datatype[] variable_name = new datatype[size]

        //1. memory allocation is not contiguous in JAVA (depends on JVM where to allocate each element of array);
        //2. heap is the runtime area from where memory is allcated to class/object/array.
        //3. Dynamic memory allocation
        //4. heap objects are not contiguous.
        //5.by default all values in a java array is 0






        //delcaration of array
        //int arr[] =  new int [5];
           // arr = {1,2,3,4,5}; //Illegal array initialization

        int arr[] =  new int []{10,20,30,40,50};


        int arr2[] = {10,12,13,14,15};



        //compileTime   RunTime
        int arr3[] = new int[5]; // Creates an array of size 5
        arr3[0] = 1;
        arr3[1] = 2;
        arr3[2] = 3;
        arr3[3] = 4;
        arr3[4] = 5;


        int ros[];//declaration of array, ros is getting defined in (stack)
        ros = new int[5]; //actual object is being created on the memory (heap)
        System.out.println(Arrays.toString(ros)); //[0, 0, 0, 0, 0]


        String []str = new String[5];
        System.out.println(Arrays.toString(str)); //[null, null, null, null, null]




        //null is a special literal we can cast it to any referance type but can't assign it to any variable'
        // null a  = null; can't do this
        // int a  =  null // cant do this

        //null can't be assigned to promitives bot can be assigned to non premitives
        //but we can use null with strinf
         String st = null;
         //all ref variables has initial  or default value null.
        //null is a special value which can be assigned to any ref type
        //& we can type cast null to any other data type










    }
}
