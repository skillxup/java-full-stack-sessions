// Yes, we can implement more than one interface
interface X {
    public void myMethod();
}

interface Y {
    public void myMethod();
}

class ImplementMoreThanOneInterface implements X, Y {
    public void myMethod() {
        System.out.println("Implementing more than one Interface");
    }
    public static void main(String[] args) {
        ImplementMoreThanOneInterface obj = new ImplementMoreThanOneInterface();
        obj.myMethod();
    }
}
