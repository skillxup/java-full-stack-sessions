class StaticVariablesSharedAmongAllInstancesClass {
    // static integer variable
    static int var1 = 85;
    
    // non-static string variable
    String var2;

    public static void main(String[] args) {
        StaticVariablesSharedAmongAllInstancesClass obj1 = new StaticVariablesSharedAmongAllInstancesClass();
        StaticVariablesSharedAmongAllInstancesClass obj2 = new StaticVariablesSharedAmongAllInstancesClass();

        obj1.var1 = 56;
        obj1.var2 = "I\'m Object1";

        obj2.var1 = 78;
        obj2.var2 = "I\'m Object2";

        System.out.println("obj1 integer: " + obj1.var1);
        System.out.println("obj1 string: " + obj1.var2);

        System.out.println("obj2 integer: " + obj2.var1);
        System.out.println("obj2 integer: " + obj2.var2);
    }
}
