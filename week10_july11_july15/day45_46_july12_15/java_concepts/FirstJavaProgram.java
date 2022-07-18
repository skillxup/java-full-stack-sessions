public class FirstJavaProgram {
    public static void main(String args[]) {
        System.out.println("This is my First Java Program");
    }
}
// to compile: 
// javac FirstJavaProgram.java

// to run: 
// java FirstJavaProgram

// explanation about the above program
// public: this makes the main method public that means that we can call the method from outside of the class

// static: we do not need to create object for a static methods to run. they can run itself

// void: it does not return anything

// main: it is a method name. this is the entry point method from which the JVM can run the program

// (String args[]): used for command line arguments that are passed as strings

// System.out.println(): this method prints the contents inside the double quotes into the console and inserts a newline after