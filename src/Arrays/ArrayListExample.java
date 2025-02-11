package Arrays;
import java.util.*;
public class ArrayListExample {


    public static void main(String[] args) {
        //its just like vector in C++;

                 //generics  <Integer>  //need to add wrapper classes not primitive
        ArrayList<Integer> list =  new ArrayList<>(2);
        list.add(69);
        list.add(32);
        list.add(2312);
        list.add(2312);
        list.add(2312);
        list.add(2311);
        list.add(2312);

        System.out.println(list);
        System.out.println(list.contains(2312));
        list.set(0,99);
        //System.out.println(list[0]);  //// ❌ Incorrect way to access elements
        System.out.println(list.get(0));
        list.remove(1);
        System.out.println(list);
        System.out.println(list.size());

        //input //already pushed elements k age add krne k lye
        Scanner in =  new Scanner(System.in);
        System.out.println("No of elements need to add further");
        int newElements = in.nextInt();
        System.out.println("Enter" + newElements + "elements:");
        for(int i =0 ;i<newElements ;i++){
            list.add(in.nextInt());
        }

        System.out.println("Updated list"+ list);




    }
}
