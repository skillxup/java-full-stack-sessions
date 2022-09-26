class ParentClass {
    public void disp() {
        System.out.println("disp() method of Parent Class");
    }
}

class DynamicMethodDispatch extends ParentClass {
    public void disp() {
        System.out.println("disp() method of Child Class");
    }

    public void newMethod() {
        System.out.println("new method of Child Class");
    }

    public static void main(String[] args) {
        ParentClass obj1 = new ParentClass();
        obj1.disp();

        DynamicMethodDispatch obj2 = new DynamicMethodDispatch();
        obj2.disp();
    }
}
