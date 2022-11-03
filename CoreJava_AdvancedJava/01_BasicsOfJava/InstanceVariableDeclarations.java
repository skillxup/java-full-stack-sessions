public class InstanceVariableDeclarations {
    String myInstanceVar = "Instance Variable";

    public static void main(String[] args) {
        InstanceVariableDeclarations obj = new InstanceVariableDeclarations();
        InstanceVariableDeclarations obj2 = new InstanceVariableDeclarations();
        InstanceVariableDeclarations obj3 = new InstanceVariableDeclarations();

        System.out.println(obj.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);

        obj2.myInstanceVar = "Changed Text";

        System.out.println(obj.myInstanceVar);
        System.out.println(obj2.myInstanceVar);
        System.out.println(obj3.myInstanceVar);
    }
}
