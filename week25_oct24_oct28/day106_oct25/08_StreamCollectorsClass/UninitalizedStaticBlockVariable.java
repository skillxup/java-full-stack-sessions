class UninitalizedStaticBlockVariable {
    // static blank final variable
    static final int ROLL_NO;
    
    static {
        ROLL_NO = 32;
    }

    public static void main(String[] args) {
        System.out.println(UninitalizedStaticBlockVariable.ROLL_NO);
    }
}
