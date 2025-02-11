package Arrays;

public class Q2MaxValueofArray {

    public static void main(String[] args) {
        int srr [] = { 10,23,43,14,16};

        System.out.println(Max(srr));
    }

    private static int Max(int[] srr) {
        int max = srr[0];
        for(int i =1;i< srr.length;i++){
            if( max < srr[i]){
                max =  srr[i];
            }

        }
        return max;
    }
}
