package day37_Inheritance.AnimalTask;

public class AnimalObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog("Alex", "Husky", 'M',"Small",1,"White");

        System.out.println(dog1);

        Cat cat1 = new Cat("Love", "Siamese",'F',"Large",2,"Black");

        System.out.println(cat1);
        cat1.scratch();
        //  cat1.bark();
        //  cat1.sing();


        Parrot parrot1 = new Parrot("King","Macaw",'M', 3,"Small", "Blue");

        System.out.println(parrot1);

        parrot1.sing();










    }


}
