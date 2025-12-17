package in.kgcoding.challange83;

public class Test {
    public static void main(String[] args) {


        // Shape shape = new Shape(); not possible coz the Shape class is abstracted

        /**
         * here just the instance variable is of the Shape class not object
         * object is of the circle class.
         * same in the object of the square
         * we can also make the instance of circle or square class totally based on our choise
         */
        Shape shape = new Circle(5.5); //
        System.out.printf("Area of the Circle is: %f%n " , shape.calculateArea());

        Shape square = new Square(2.3);
        System.out.printf("Area of the square is: %f%n" , square.calculateArea());
    }
}
