public class StaticVariableDeclarations {
    // declaration of static variable
    public static String myClassVar = "Class or Static Variable";
    public static void main(String[] args) {
        StaticVariableDeclarations obj = new StaticVariableDeclarations();
        StaticVariableDeclarations obj2 = new StaticVariableDeclarations();
        StaticVariableDeclarations obj3 = new StaticVariableDeclarations();

        // it will display 'class or static variable'
        System.out.println(obj.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);

        obj2.myClassVar = "Changed Text";

        // it will display 'class or static variable'
        System.out.println(obj.myClassVar);
        System.out.println(obj2.myClassVar);
        System.out.println(obj3.myClassVar);

        // accessing the static variable without the object also
        System.out.println(myClassVar);
    }
}
