package hrishik;


public class Shadowing {
    static int x  = 40; // this variable shoadowned by another x variable in the function on line 9
    public static void main(String[] args) {
        int x ;
            //System.out.println(x); // this will git error as shadowing begin form initilization of variable not declaration
        x= 10; // this shadows the class variable declaered on line 5
        System.out.println(x); // 40
        fun(); // 10  because fun function uses the global scoped x


    }

    static void fun(){

        System.out.println(x);
    }


}
