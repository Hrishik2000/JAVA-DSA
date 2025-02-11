package hrishik;

public class Q5ReverseANumber {

    public static void main(String[] args) {

        //print reverse of given number (positive numbers)
        int n = 23497;
        int revNumber = 0;

        if(n==0){
            System.out.println(0);
            return;
        }

        while(n>0){

            int rem =  n%10;
            revNumber = revNumber*10 + rem;
            n = n/10;
        }
        System.out.println(revNumber);


    }
}
