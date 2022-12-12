package shapes;

public class ShapesTest {

    public static void main(String[] args) {

//    instances
        Measurable myShapeA = new Rectangle(3, 3);
        Measurable myShapeB = new Square(5);

//
        System.out.println("myShape A Area is: " + myShapeA.getArea()); // myShapeA Area is: 9.0
        System.out.println("myShape A Perimeter is: " + myShapeA.getPerimeter()); //myShapeA Perimeter is: 12.0

        System.out.println("myShape B Area is: " + myShapeB.getArea()); // myShapeB Area is: 25.0
        System.out.println("myShape B Perimeter is: " + myShapeB.getPerimeter()); //myShapeB Perimeter is: 20.0

//        Rectangle box1 = new Rectangle(4, 5);
//
//        System.out.println("box1.getArea() = " + box1.getArea());
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("box2.getArea() = " + box2.getArea());
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
    }

}
