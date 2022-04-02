package day32_CustomClassConstructors;

public class Carpet {

    public double width;
    public double length;
    public double unitPrice;
    public boolean isPersian;

    public Carpet(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length=length;
        this.unitPrice= unitPrice;
        this.isPersian= isPersian;

    }

    public double calcCost(){
        double totalPrice = unitPrice*(width*length);

        if (isPersian){
            totalPrice+=200;
        }
        return totalPrice;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price= $" + calcCost() +
                '}';
    }



}
