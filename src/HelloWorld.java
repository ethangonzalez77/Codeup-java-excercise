public class HelloWorld{
    public static void main(String[] args) {

        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");
        int myFavoriteNumber = 22;
        System.out.println(myFavoriteNumber);
        String myString = "Wuzz, Up!";
        System.out.println(myString);
        myString = "today is a good day";
        System.out.println(myString);
//        myString = 3.14159;
//        System.out.println(myString); //  cant use a int in a string var
//        long myNumber;
//        System.out.println(myNumber); // wont print anything cuz nothing has been initialized
//        myNumber = 3.14;
//        System.out.println(myNumber); // wont print cuz its a float not a long number
//        myNumber = 123L;
//        System.out.println(myNumber);
//        myNumber = 123;
//        System.out.println(myNumber);
//        float myNumber = 3.14;
//        System.out.println(myNumber); // lossy convo from double to float? q9 ????????
//        int x = 5;
//        System.out.println(x++); // pro incrementation , wont add the extra 1 till after the second print
//        System.out.println(x); // final result will be here
//         x = 5;
//        System.out.println(++x); //pre incrementation will add the 1 immediately
//        System.out.println(x);
//        class myClass; // something about '{' expected
//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o; //class java.lang.String cannot be cast to class java.lang.Integer
//        int three = (int) "three"; //incompatible types: java.lang.String cannot be converted to int
//        int x = 4;
//        x = x + 5;
//        System.out.println(x); // long hand
//        int x = 4;
//        x += 5;
//        System.out.println(x); //short hand the first one Q1
//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y); //short hand the first one Q2
        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(y);  //short hand the first one Q3
        int theMax = Integer.MAX_VALUE;
        System.out.println(theMax); // when incremented past the max it turn into to negative max
        int theLowest = -2147483648;
        System.out.println(--theLowest); //when DE-incremented past the max it turn into to the positive max
        theMax += 2000000000;
        System.out.println(theMax);
    }
}



