package in.kgcoding.challange77.utils;

import in.kgcoding.challange77.Circle;
import in.kgcoding.challange77.Rectangle;

public class Calculator {

    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10,25);

        double cirArea = Math.PI * Math.pow(cir.radius,2);
        double rectArea = rect.length * rect.breath;

        System.out.printf("the area of the circle is : %f" , cirArea);
        System.out.printf("the area of the circle is : %f" , rectArea);

    }
}
