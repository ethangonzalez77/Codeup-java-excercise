import java.util.Scanner;
public class SandBox {
//         this is a method that can be called on a class without needing an instance(aka object) of that class to run it, thats how the jre is going👇 to run it ex: SandBox.main()
    public static void main(String[] args) {
//        //an array of strings👆that are arguments that can be passed to your program, you basically don't care what is passed in this method, your program is gunna do what it's guna do. a sandbox that lets you run any code
//
//        System.out.print("Code inside of curly braces should be indented "); // all on one line, no line break
//        System.out.print("with four spaces");// both of these are in on one line
//
//        System.out.println("the following is the same shit but in it's own line, it's own element.");//at the end of this sentence it will make a new line
//        System.out.println("Code inside of curly braces should be indented ");
//        System.out.println("with four spaces");
//
//        String name1 = "codeup";
//        System.out.printf("Hello there, %s. Nice to see you.%n", name1);
//
//        String greeting = "Salutations";
//        String name2 = "codeup";
//        System.out.printf("%s, %s! %n", greeting, name2);
//
//        int x = 5;
//        System.out.println(x > 2 ? x < 4 ? 10 : 8 : 7);
//
//        int y = 5 * 4 % 3;
//        System.out.println(y);
//
//                                        //primitive types
//        //-128 to 127
//        byte myByte = 24;// only whole numbers, no decimals
//        System.out.printf("This is a byte: %s %n", myByte);
//
//        //-32,768 to 32,767
//        short shortie = 2999;// still whole numbers, also never really used
//        System.out.printf("This is a short: %s %n", shortie);
//
//        //-2,147,483,648 to 2,147,483,647
//        int myInt = 2444555;
//        System.out.printf("This is a int: %s %n", myInt);//most common
//
//        //-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
//        long myLong = 911122233;
//        System.out.printf("This is a long: %s %n", myLong);// used for long ass numbers
//
//        //about 6 decimal digits
//        float myFloat = 6.3f;// have to use f charecter so that the data type knows it's a float, without it, it thinks it's a double
//        System.out.printf("This is a float: %s %n", myFloat);//used for decimals
//
//
//        //about 15 decimal digits
//        double myDouble = 45.1234;
//        System.out.printf("This is a double: %s %n", myDouble);//also used for decimals
//
//        boolean myBoolean = true;
//        boolean moreThan1000 = (myInt < 1000); // or you could do this. it holds the result of this evaluation
//        System.out.printf("This is a boolean: %s. %s. %n", myBoolean, moreThan1000);
//
//        char myChar = 'U';// cant use "" because the char datatype considers this to be a string not a single char
//        //String is not a primitive data type, you can just use string if your using a single char seems that's what most people do
//
//                                        //constants
//        // final type NAME_OF_VAR = value;
//        final String MY_STRING = "Hello World";
//        System.out.printf("This is a constant: %s %n", MY_STRING);
//
//                                        //casting: converting a data type to another
//        // implicit casting: happens automatically when converting from narrow range data type to a wider range data type ex "float" to a "double"
//        double d1 = 4;//int -> double. The range of a "double" is wider than an "int"
//        double d2 = 5.7f;//float -> double. The range of a "double" is wider than a "float"
//        long l1 = 100;//int -> long. The range of a "long" is wider than an "int"
//
//        int myInt2 = 7;
//        double d3 = myInt2;
//        System.out.printf("Here is a series of numbers: %n %s %n %s %n %s %n ALSO:%n %s %n %s %n", d1,d2,l1,myInt2,d3);
//
//
//        // explicit casting: not automatically, done manually when converting from a wider to a narrower data type ex "long" "int"
//        //   int i1 = 4.5;  //error
//        //   int i2 = 8l; //error
//        //   float f1 = 4.5; //error
//        //range of an "int" is narrower than "double"
//        // you would do this to make it work (new data type) expression
//        int i1 = (int) 4.5;//4.5 -> 4 (data loss)
//        int i2 = (int) 8L;//8l -> 8
//        float f1 = (float) 4.5;//4.5 -> 4.5f
//
//        double dd1 = 4.5 + 3;
//        double dd2 = 4.5 + (double) 3;// same out put different approach 7.5
//
//        double dd3 = 4.2; // 4.2
//        int i = (int) dd3;// this won't change the original var
//
//
//
//
//        //the programmer tells Java to do the casting
//        System.out.printf("Here is a series of numbers: %n %s %n %s %n %s %n ALSO THESE: %n %s %n %s %n BEFORE: %s %n AFTER: %s %n", i1,i2,f1,dd1,dd2,dd3,i);
//
//                                        //scanner
//        //Before we can use the Scanner class, we'll need to import it.
//        //Java organizes code through packages; you can think of a package as a namespace for a group of related code.
//        //import statements are what let us use code from other packages.
//
////                  points to the keyboard👇 and is also an object of the InputStream class       System.out points to the screen
//        Scanner toto = new Scanner(System.in); // NOW our "toto" object can be used to read data from the keyboard
////      👆class 👆var       👆constructor 👆parameter = creating an object, (supposedly) and now this object can be used to read data from the keyboard
//
//        System.out.print("Enter something: ");
////input methods used to read specific types of data from the keyboard. When the method is called, the program will pause execution and wait for the user to enter
//// a value, the entered value will be returned by this method
////input method that reads a string👇
//        String userInput = toto.next();//Every individual entry to the scanner is called a token, and, by default, tokens are separated by any whitespace
////                 👆stores the user's input
//        System.out.println("What ever you type will only accept one token: --> \"" + userInput + "\" <--");
//
//        System.out.print("Enter something again: ");
//        String userInput2 = toto.nextLine();//will accept multiple tokens and stores the users input
//        System.out.println("This will show multiple tokens:" + userInput2);
//
//                                        //Control structures
//        // allow us to control the flow of execution of our code, either executing code conditionally, or repeatedly
//        //selection statements (conditionals): Control structures that conditionally execute code. Includes the if and switch statements.
//        //Loops : Control structures that repeatedly execute code. Includes the while, do, and for loops.
//
//        boolean someCondition = false;
//        boolean someOtherCondition = true;
//
//        if (someCondition) {
//            // executes if someCondition is true
//        } else if (someOtherCondition) {
//            // executes if someOtherCondition is true *and* all of the previous ifs in
//            // this block were false
//        } else {
//            // executes if none of the conditions checked in this block were true
//        }
//
//        //Switch statements can be thought of as a special case of the if-else if block; one where we are comparing a given value (the expression inside the parenthesis) to multiple known values (the values in the case labels).
//        //In Java, all values in the case labels of a given switch statement must be of the same type. In addition, they must also be either literals, or final variables.
//        int caseSwitch = 1;
//
//        switch (caseSwitch) {
//            case 1:
//                System.out.println("Case 1");
//                // Fall through!
//            case 2:
//                System.out.println("Case 2");
//                break;
//            default:
//                System.out.println("Default case");
//                break;
//        }
//
//        int a = 0;
//        while (a < 10) {
//            System.out.println("a is " + a);
//            a++;
//        }
//
//        for(int b = 0; b < 10; b += 1) {
//            System.out.println("b is " + b);
//        }
//        //The loop below uses a break to only print the numbers 1 through 5, even though the condition of the loop specifies that the loop should happen 100 times.
//        // print the numbers 1 through 5
//
//        for(int c = 1; i < 100; c++) {
//            System.out.println(c);
//            if (c == 5) {
//                break; // --------------+
//            } //                        |
//        } //                            |
//// <----------------------------+
//        //A continue statement is used to skip any remaining statements in the current loop and jump to the top of the current loop. A labeled continue statement may be used to jump to the top of a labeled loop.
//        for(int d = 1; d <= 10; d++) { // <--+
//            if(d % 2 == 1) { //              |
//                continue; // ----------------+
//            }
//            System.out.println(d);
//        }
//                                        //String Comparison
//        //While we use == to compare primitive types, we need to handle strings a little differently. Each String is a different object, as demonstrated in the example below:
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Continue? [y/N] ");
//        String userInput3 = sc.next();
//
//        // Don't do this!
//        boolean confirmation = userInput3 == "y";
//        //In the above example, confirmation will always be false, even if the user types "y"!
//
//        //Instead, we should use either the .equals or .equalsIgnoreCase method on the String we want to compare.
//
//        // Do this instead
//        //boolean confirmation = userInput3.equals("y");
//
//                                        //strings: There are two main categories of types in Java: primitive and reference data types.
//        //Unlike the other types we've worked with so far, strings are objects, not primitives. This means that String variables are a reference type, not a primitive type, and is the reason that the == operator does not behave as expected when comparing strings.
//
//        //Using the == operator with two objects checks if both sides are the same reference, that is, if they refer to the same object.
//
//        //we couldn't compare the two String objects with == because, even though they had the same value, they were two distinct objects: one was created from a string literal in our source code, and the other was created by the scanner reading what the user typed into the console.
//
//        //Strings are immutable. This means that once a string is created, it cannot be changed.
//
//        //In Java, the + operator performs string concatenation when one of it's operands is a String; it will convert any other types to a String as well. Another way to do this is with the concat method on any string object.
//        String message = "Hello";
//        System.out.println(message); // prints "Hello"
//        message = message + " World!";
//        System.out.println(message); // prints "Hello, World!"
//
//        //Because strings are not primitive data types but objects, we must use methods to compare them rather than the relational operators.
//
//        //Scanner sc = new Scanner(System.in);
//        //System.out.print("Continue? [y/N] ")
//        //String userInput = sc.next();
//        //
//        //// Don't do this!
//        //boolean confirmation = userInput == "y";
//
//        //while userInput and the string literal "y" may have the same value, they refer to different objects; therefore, comparing them with == will not work the way we want it to.
//
//        //// DON'T DO THIS
//        //if ("I am a string" == "I am a string") {
//        //    System.out.println("Strings are equal");
//        //}
//
//        //should use either the equals or equalsIgnoreCase method on a string object to compare STRING VALUES.
//        // Do this instead!
//        if ("I am a string".equals("I am a string")) {
//            System.out.println("Strings are equal");
//        }
//
//        //String Comparison Methods
//        //Let's take a look at some  common methods we can use to compare strings. All of the methods we will look at here return either true or false.
//        String input = "Codeup Rocks!";
//
//        input.equals("codeup rocks!"); // false
//        input.equals("Codeup Rocks!"); // true
//
//        input.equalsIgnoreCase("codeup rocks!"); // true
//        input.equalsIgnoreCase("Codeup Rocks!"); // true
//
//        input.startsWith("codeup"); // false
//        input.startsWith("Codeup"); // true
//
//        input.endsWith("rocks"); // false
//        input.endsWith("rocks!"); // false
//        input.endsWith("Rocks!"); // true
//                                            //methods
//        //The most basic syntax for a method definition looks like this:
//        public static returnType methodName([param1[, param2[, ...]]) {
//            // the statements of the method
//            // a return statement, if a return type is declared
//        }
////visibility👇modifier  👇return type of the method.
//        public static String sayHello(String name) {
//            return String.format("Hello, %s!", name);
//        }
//        //If a method defines a return type, it must have a return statement. It is a compile time error for a method that defines a return type to not return anything, or to return a value of a type other than the one that is specified.
//
//        //If a method's return type is void, it is a compile time error to return anything inside of the method; however, methods with a void return type can still use the return keyword to exit the method early.
//        public static void sayHello(String greeting, String name) {
//            System.out.printf("%s, %s!\n", greeting, name);
//        }
//        public static int returnThree() {//A method can be defined with no parameters, one parameter (like in our example), or multiple parameters (separated by commas). A type must be specified for each parameter.
//            return 3;
//        }
//        public static String shout(String s) {
//            return s.toUpperCase() + "!!!";
//        }
//        startApplication();                         // called with no arguments
//        logInfo("User #214 registered!");           // called with one argument
//        addAttribute("loggedInUser", loggedInUser); // called with multiple arguments
//
//        // using the return value
//        int three = add(6, 3) / subtract(4, 1);
//        boolean isLoggedIn = checkLoginStatus();
//        //Keep in mind that the data type of the arguments must be the same as the data type of the parameters that the method is defined with
//
//
//        //Method overloading is defining multiple methods with the same name, but with different parameter type, parameter order, or number of parameters.
//        // version 1
//        public static void sayHello(int times) {
//            for (int i = 0; i < times; i += 1) {
//                sayHello();
//            }
//        }
//        // version 2
//        public static void sayHello() {
//            sayHello("Hello", "World");
//        }
//        // version 3
//        public static void sayHello(String name) {
//            sayHello("Hello", name);
//        }
//        // version 4
//        public static void sayHello(String greeting, String name) {
//            System.out.println(greeting + ", " name "!");
//        }
//
//        //One problem solving technique in programming is called recursion. Recursion is a concept that aims to solve a problem by dividing it into smaller chunks. The core idea of recursion is creating a method that calls itself, but with different parameters than were originally passed.
//
//        //Whenever you are writing a recursive method, you must make sure to have a base case or stop condition so that the method does not call itself over and over again indefinitely.
//        public static void count(int n) {
//            if (n <= 0) {
//                System.out.println("All done!");
//                return;
//            }
//            System.out.println(n);
//            count(n - 1);
//        }
//
//        public static void main(String[] args) {
//            count(5);
//        }

                                        //classes
        //they can have variables or methods
        //classes allow you to model a real world attribute inside your program, basically creating our own data type, but a data type that represents a real world entity, like a phone or a student. because there's a lot of stuff that cant be represented in a string or a number, this is where classes come in.


        //make sure your class is one subject, don't name a class "Person" and have methods/variables that deal with weather. this creates messy code!!!

                                        //objects
//class name👇        👇var name  👇new object and supposedly known as a constructor
//        MarvelSandBox p1 = new MarvelSandBox();//declare object, and an objects an instance/member of a class like an apple from a tree
//        p1.heros = "wolverine";// intailize object
//        p1.powerLevel = 22;
//
//        MarvelSandBox p2 = new MarvelSandBox();
////       👇DOT operator, this allows us to have access to the var that's inside the Marvel class
//        p2.heros = "storm";
//        p2.powerLevel = 100;
////          👆name of the var that's in the Marvel class
//        p2.attack();
////           👆method name
////        System.out.println(p1.hero + " " + p1.powerLevel);
//        p1.attack();
//
//
//        MarvelSandBox p3 = new MarvelSandBox();
//        p3.heros = "dead pool";
//        p3.powerLevel = 0;
//
//        p3.attack();
//        //below is a static method:
//        MarvelSandBox.saySomething("What's good homie");//an example of using a public static method(MarvelSandBox line 24)
//
//        String[] hello = {"heyall", "hows the weather?", "wuzzz up!!!"};
//        MarvelSandBox.sayArray(hello);

    }
}
