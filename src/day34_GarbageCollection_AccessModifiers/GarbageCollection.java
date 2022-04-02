package day34_GarbageCollection_AccessModifiers;

import day30_CustomClassIntro.Dog;
import day32_CustomClassConstructors.Car;
import day33_Statics.Iphone;

import java.util.ArrayList;

public class GarbageCollection {
    public static void main(String[] args) {

        String str = null;

        System.out.println(str.toUpperCase());


        Car car1 = new Car("Toyota");
        car1 = null;
        System.out.println(car1);

        System.out.println("-------------");

        Dog dog1 = new Dog();

        dog1.name = "Lucy";
        dog1 =new Dog();
        dog1.name = "Max";

        String language = "Python";
        language    =   "Java";

        System.out.println(language);

        System.out.println("-----------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);


    }
}
