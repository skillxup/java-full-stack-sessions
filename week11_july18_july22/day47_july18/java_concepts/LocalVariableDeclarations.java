public class LocalVariableDeclarations {
    // instance variable
    public String myVar = "instance variable";

    public void myMethod() {
        // local variable
        String myVar = "Inside Method";
        System.out.println(myVar);
    }
    public static void main(String args[]) {
        // creating object
        LocalVariableDeclarations obj = new LocalVariableDeclarations();

        System.out.println("Calling Method");
        obj.myMethod();
        System.out.println(obj.myVar);
    }
}
