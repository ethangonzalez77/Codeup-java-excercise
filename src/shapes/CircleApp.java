package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input cInfo = new Input();
        boolean result;

        do {
            System.out.println("Enter in a radius between 1 and 10: ");
            double userInput = cInfo.getDouble(1.0,10.0);
            System.out.println(userInput);


            Circle circle1 = new Circle(userInput);
            System.out.println("The area is: " + circle1.getArea());
            System.out.println("The circumference is: " + circle1.getCircumference());
            System.out.println("The radius is: " + circle1.getRadius());

            System.out.println("Do you want to make another Circle? (Y/N)");

            result = circle1.yesNo();

        } while (result);

        System.out.println("Exiting program");


    }


}
