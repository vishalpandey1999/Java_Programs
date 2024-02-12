package Array_List;

import java.util.*;

public class insertColorUsingArrayList {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Yellow");
        colors.add("Black");
        colors.add("White");
        colors.add("Blue");
        colors.add("Green");
//        print the collection of the color
//        System.out.println(colors);
//        iterate one by one using lambda expression
//        colors.forEach(System.out::println);
//        iterate one by one using lambda expression(other approach)
//        for(String color : colors){
//            System.out.print(color+", ");
//        }
//        colors.add(0,"Pink");
//        for(String color : colors){
//            System.out.print(color+", ");
//        }


//        retrieve data from specific position

//        System.out.println("I'm retrieving data from position two->"+colors.get(2));

//        update the value by using set() method

//        System.out.println("Before updating colors list-> "+colors);
//        colors.set(1,"vishal");
//        System.out.println("After updating colors list-> "+colors);

//        remove the data by using remove() method
//        System.out.println("Before removing colors list-> "+colors);
//        colors.remove(1);
//        System.out.println("After removing element from position 1:-> "+colors);

        System.out.println("Before extract color list: "+colors);
        List<String> sub_list = colors.subList(0,3);
        System.out.println("After extract colors list: "+sub_list);

    }
}
