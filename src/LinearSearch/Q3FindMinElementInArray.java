package LinearSearch;

public class Q3FindMinElementInArray {
    public static void main(String[] args) {

        int arr[] = {10,21,43,15,156,84,1};
        int mini =   arr[0];
        for(int i : arr){
            if(mini > i){
                mini = i;
            }

        }

        System.out.println(mini);
    }



}
