package LinearSearch;

public class Q2searchInRange {

    //search in range

    public static void main(String[] args) {

        int arr[] = {18,12,-7,3,14,28};
        int target = 14;

        int start = 0;
        int end = 4;

        System.out.println(SearchInRange(arr,target,start,end));

    }

    private static boolean SearchInRange(int[] arr, int target, int start, int end) {

        for(int i = start ; i<=end ; i++){
            if(target == arr[i]){
                return true;
            }
        }
        return false;
    }
}
