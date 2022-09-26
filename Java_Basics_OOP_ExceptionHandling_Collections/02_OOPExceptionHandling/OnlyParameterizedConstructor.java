public class OnlyParameterizedConstructor {
    private int var;

    public OnlyParameterizedConstructor(int num) {
        this.var = num;
    }

    public int getValue() {
        return var;
    }
    
    public static void main(String[] args) {
        OnlyParameterizedConstructor obj1 = new OnlyParameterizedConstructor(23);
        System.out.println("var is: " + obj1.getValue());
    }
}
