class StaticClassExample {
    private static String str = "Java Concepts";
    
    // static class
    static class MyNestedClass {
        // non-static method
        public void disp() {
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        StaticClassExample.MyNestedClass obj = new StaticClassExample.MyNestedClass();
        obj.disp();
    }
}
