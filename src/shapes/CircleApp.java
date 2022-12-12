package shapes;

import util.Input;


public class CircleApp {

    public static void main(String[] args) {
        Input cInfo = new Input();
        boolean result;
        do {
            System.out.println("Enter in a radius between 1 and 10: ");
            double userInput = cInfo.getDouble(1.0, 10.0);
            System.out.println(userInput);

            Circle nCircle = new Circle(userInput);
            System.out.println("The area is: " + nCircle.getArea());
            System.out.println("The circumference is: " + nCircle.getCircumference());
            System.out.println("The radius is: " + nCircle.getRadius());

            System.out.println("Would you like to make more circles?(Y/N)");

            result = cInfo.yesNo();

        } while (result);
    }
}
