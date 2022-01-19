package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        //area and perimeter of a given circle

        //PI, radius, diameter, area, perimeter
        double radius = 3.5;
        double PI = (22/7);
        double diameter = radius * 2; //finds the diameter by multiplying the radius to 2
        double area = radius * radius * PI; //finds the area
        double perimeter = 2 * PI * radius;

        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
        System.out.println("diameter = " + diameter);
        System.out.println("radius = " + radius);







    }
}
