package hrishik;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchCase {

    public static int getNumber() {
        System.out.println("Returning 10");
        return 10;
         // System.out.println("This will cause an error!"); // Unreachable statement Compilation error
    }


    //== vs .equals()
    // .equals() compares on the bases of values not referance (in both caSES IT give true
    // == checks the referance not value (if will give true in case both referances points to the same object in heap





    //expression cant be written in switch
    //string, number can be used in switch
    // //default case can be placed in between switch ladder. , put break after it.
    //multiple default case could not be there
    //nested switch is possible


    public static void main(String[] args) {


        String a = "Hrishik";
        String b = "Hrishik";
        //int b = 4;
        if (a ==b ){
            System.out.println("equal ==");
        } if(b.equals(a)){
            System.out.println(".Equals()");
        }
        else {
            System.out.println("not ewual");
        }





        System.out.println("Enter fruit name");
        Scanner in = new Scanner(System.in);
        String name =  in.next();

        //basic switch
//        switch(name){
//            case "apple":
//                System.out.println("sweet fruit");
//                break;
//            case "mango":
//                System.out.println("KIng of fruit");
//                    break;
//            default: //default case can be placed in between switch ladder.
//                System.out.println("normal fruit");
//                break;
//            case "banana":
//                System.out.println("Long fruit");
//                break;
//        }













        //enhanced switch
        switch(name){
            case "apple" -> System.out.println("sweet fruit");

            case "mango" -> System.out.println("KIng of fruit");

            default -> System.out.println("normal fruit");

            case "banana" -> System.out.println("Long fruit");
        }


        //multiple case with one resolution  can be handled like this:
        int Day = in.nextInt();

        switch (Day){
            case 1,2,3,4,5  -> System.out.println("WeekDay");
            case 6,7 -> System.out.println("Weekend");
        }


        //nested switch: (basic)
        System.out.println("enter emp id");
        int EmpId = in.nextInt();
        //System.out.println("enter dept");
        //String Dept = in.next();

//        switch(EmpId){
//            case 1:
//                System.out.println("ram");
//                break;
//            case 2:
//                System.out.println("shyam");
//                System.out.println("confirm dept");
//                String Dept = in.next(); //user input can be taken inside switch case
//                switch (Dept){
//                    case "IT":
//                        System.out.println("INFO TECH DEPT");
//                        break;
//                    case "MECH":
//                        System.out.println("Mechanical dept");
//                        break;
//                    default:
//                        System.out.println("Jhandu dept");
//                }
//                break;
//            default:
//                System.out.println("Not member of company");



        //enhanced switch
        switch (EmpId) {
            case 1 -> System.out.println("ram");
            case 2 -> {
                System.out.println("shyam");
                System.out.println("confirm dept");
                String Dept = in.next(); //user input can be taken inside switch case
                switch (Dept) {
                    case "IT" -> System.out.println("INFO TECH DEPT");
                    case "MECH" -> System.out.println("Mechanical dept");
                    default -> System.out.println("Jhandu dept");
                }
            }
            default -> System.out.println("Not member of company");
        }







        System.out.println(getNumber());

    }
}
