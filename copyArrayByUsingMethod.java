package Array_List;

import java.util.*;

public class copyArrayByUsingMethod {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        list1.add("4");
        list1.add("5");
        System.out.println("List1: "+list1);

        List<String>list2 = new ArrayList<>();
        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");
        System.out.println("List2: "+list2);
//        copy list1 to list2
        Collections.copy(list2,list1);
        System.out.println("Copy List to List2,\nAfter copy:");
        System.out.println("List1: "+list1);
        System.out.println("List2: "+list2);
    }
}
