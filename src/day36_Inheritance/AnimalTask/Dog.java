package day36_Inheritance.AnimalTask;

public class Dog extends Animal{
   //        child        parent
    public String tile ;

    public void bark(){
        System.out.println(name + " is barking");
    }


    public String toString() {
        return "Dog{" +
                "tile='" + tile + '\'' +
                "} " + super.toString();
    }
}
