package Basics;

import java.util.ArrayList;
import java.util.Collections;

public class MyArrayList {
    public static void main(String[] args)
    {
        ArrayList<Integer> list1 = new ArrayList<>();
//        ArrayList<String> list2 = new ArrayList<>();
//        ArrayList<Boolean> list3 = new ArrayList<>();
//        System.out.println("Hello world!");

        // Adding elements
        list1.add(21);
        list1.add(10);
        list1.add(11);

        System.out.println(list1);

//        get elements
        System.out.println(list1.get(1));

//        Add element in between
        list1.add(1,1);
        System.out.println(list1);

//        set element
        list1.set(0,500);
        System.out.println(list1);


//        delete element
        list1.remove(2);
        System.out.println(list1);

//        size method
        int size = list1.size();
        System.out.println(size);

//        loops
        for(int i=0;i<list1.size();i++){
            System.out.println(list1.get(i));
        }
//        sorting
        Collections.sort(list1);
        System.out.println(list1);


    }
}
