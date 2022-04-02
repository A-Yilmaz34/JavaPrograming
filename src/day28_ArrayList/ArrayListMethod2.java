package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethod2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

        Integer n= 400;

        boolean r= list.remove(n);
        System.out.println(r);


        list.clear();
        System.out.println(list);

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('b');

        int a =  characters.indexOf('A'); //0
        int b = characters.lastIndexOf('A'); //4


        System.out.println(a);
        System.out.println(b);
        System.out.println("------------");


boolean r2 = characters.contains('A');
boolean r3 = characters.contains('Z');

        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2);
        System.out.println(list1.equals(list2));
        boolean r4= list.isEmpty();
        System.out.println("r4"+r4);


        ArrayList<Integer> numbers = new ArrayList<>();
        //Bulk Operation: CollectionType
        numbers.addAll( Arrays.asList(1,2,3,4,5,6,7) );

        System.out.println(numbers);

    }
}
