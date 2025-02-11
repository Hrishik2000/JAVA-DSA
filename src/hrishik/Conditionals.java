package hrishik;

public class Conditionals {

    public static void main(String[] args) {
        // print from 1 to 5

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }



        //user when you dont know the number of iterations
        int i = 1;
        while(i<=5){
            System.out.println(i);
            i++;
        }

        do{
            System.out.println("hello");

        }while(i<=4);




        //find largest
        int a = 20;
        int b = 40;
        int c = 30;
        int max = a;
        if(b>max){
            max = b;
        }
        if(c> max){
            max = c;
        }
        System.out.println(max);


        int p =  30;
        int q = 60;
        int maximum = Math.max(p,q);
        System.out.println(maximum);
    }


}
