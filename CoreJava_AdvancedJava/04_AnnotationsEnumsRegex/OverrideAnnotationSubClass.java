class ParentClass {
    public void displayMethod(String msg) {
        System.out.println(msg);
    }
}

class OverrideAnnotationSubClass extends ParentClass {
    @Override
    public void displayMethod(String msg) {
        System.out.println("Message: " + msg);
    }
    public static void main(String[] args) {
        OverrideAnnotationSubClass obj = new OverrideAnnotationSubClass();
        obj.displayMethod("Hey!!");
    }
}
