/*
Learn Programming Academy's Java 1Z0-815 Certification Exam Course
Section 7: Creating and Using Methods
Topic: Create Methods and Constructors
Sub-Topic: static keyword
*/

// This class demonstrates static fields, a static initializer, and
// a static method
class StaticStuff {
    static final String appName = "A Good App"; // class doesn't need to be initialized to use a final var

    // static initializer when the StaticStuff was called
    static {
        System.out.println("Initializing StaticStuff class");
        StaticStuff.counter++;
    }

    static void printAppName() {
        System.out.println("Application Name:  " + appName +
                " : counter  = " + counter);
    }

    static int counter;
}

public class StaticElementTests {
    public static void main(String[] args) {
        // Add some 'work' first to prove StaticStuff not initialized
        // on start-up
        for (int i = 0; i < 3; i++) {
            System.out.println("Printing " + (i));
        }

        //** Create an object of type StaticStuff.
       /* StaticStuff s = new StaticStuff();
        System.out.println("Created an instance of StaticStuff");*/

        //StaticStuff s = null;
/*
        // We access static member of the StaticStuff class
        //System.out.println("Application Name: " + StaticStuff.appName);
        System.out.println("Application Name: " + s.appName); //output the same, class is initialized when accessing its fields


        int myCounter = StaticStuff.counter;
        System.out.println("myCounter = " + myCounter);*/

        //execute static method on StaticStuff
       // s.printAppName(); //was initialized here



        //** Create an object of type StaticStuff.
        //static initializer is initialized only once and not for every instance of the lass
        StaticStuff s = new StaticStuff();
        System.out.println("Created first instance of StaticStuff");
        s.printAppName();

        System.out.println("Created second instance of StaticStuff");
        StaticStuff s0 = new StaticStuff();
        s0.printAppName();

        System.out.println("Created third instance of StaticStuff");
        StaticStuff s1 = new StaticStuff();
        s1.printAppName();

    }
}