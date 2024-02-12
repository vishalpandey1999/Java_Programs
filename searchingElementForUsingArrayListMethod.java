package Array_List;

import java.util.*;


public class searchingElementForUsingArrayListMethod {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList<>();
        fruit.add("Apple");
        fruit.add("Grapes");
        fruit.add("Banana");
        fruit.add("Orange");
        fruit.add("Pineapple");
        System.out.println("Before shuffler: "+fruit);
        Collections.shuffle(fruit);
        System.out.println("After shuffler: "+fruit);

//        if(fruit.contains("Banana")){
//            System.out.println("Found The Element");
//        }else{
//            System.out.println("There no such a element");
//        }

//        sorting the array
        System.out.println("Before sorting Array: "+fruit);
        Collections.sort(fruit);
        System.out.println("After sorting Array: "+fruit);

//        create second ArrayList which is integer Type
        List<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(8);
        number.add(7);
        number.add(5);
        number.add(3);
        number.add(6);
        number.add(9);
        number.add(4);
        number.add(10);
        number.add(2);
        System.out.println("Before sorting Numbers: "+number);
        Collections.sort(number);
        System.out.println("After sorting Numbers: "+number);

        System.out.println("Before reverse Numbers: "+number);
        Collections.reverse(number);
        System.out.println("After reverse Numbers: "+number);
    }
}
