class MyBaseClass {
    protected void disp() {
        System.out.println("disp() at Parent Class Method");
    }
}

class AccessModifierOverridingMethod extends MyBaseClass {
    public void disp() {
        System.out.println("disp() at Child Class Method");
    }
    public static void main(String[] args) {
        AccessModifierOverridingMethod obj1 = new AccessModifierOverridingMethod();
        obj1.disp();   
    }
}
