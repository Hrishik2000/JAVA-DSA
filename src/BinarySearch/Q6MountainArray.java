package BinarySearch;
//  https://leetcode.com/problems/peak-index-in-a-mountain-array/
public class Q6MountainArray {

    public static void main(String[] args) {
        int arr[] =  {0,1,2,3,4,5,6,3,1};

        System.out.println("Moutain peak element index is ----> " + Solution2.peakIndexInMountainArray(arr));
    }


}



class  Solution2 {
    public static int peakIndexInMountainArray(int[] arr) {


        int start =0;
        int end  =   arr.length-1;

        while(start < end){
            int mid = start + (end -start)/2;

            if(arr[mid] < arr[mid+1]){
                //we are increasing part of the array
                //hence mid element cant  be the max hence

                start = mid +1;
            }else if(arr[mid] > arr[mid+1]){
                //we are the decreasing part of the array
                //this could be the asnd but still look at left
                //this is why end is != mid-1
                end = mid;
            }
        }


        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans
        return start;
    }
}