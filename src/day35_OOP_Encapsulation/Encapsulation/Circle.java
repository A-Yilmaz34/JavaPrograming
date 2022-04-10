package day35_OOP_Encapsulation.Encapsulation;

public class Circle {

    private double radius ;
    public static double pi = 3.14;

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0){
            return;
        }
        this.radius = radius;
    }



    public double calcArea(double radius){
        double circleArea = pi * radius * radius;
        return circleArea;
    }
    public double calcPerimeter(double radius){
        double circlePerimeter = pi * radius * 2;
        return circlePerimeter;
    }


    public String toString() {
        return "Circle{" +
                "radius= " + radius +
                ", pi= " + pi +
                ", Circle area=  " + calcArea(radius) +
                ", Circle perimeter=  " + calcPerimeter(radius) +
                '}';
    }
}
