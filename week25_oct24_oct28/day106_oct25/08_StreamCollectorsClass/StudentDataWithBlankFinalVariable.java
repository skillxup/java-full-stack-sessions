class StudentDataWithBlankFinalVariable {
    // blank final variable
    final int ROLL_NO;
    
    StudentDataWithBlankFinalVariable(int rNum) {
        // it must be initialized in constructor
        ROLL_NO = rNum;
    }

    void myMethod() {
        System.out.println("Roll No: " + ROLL_NO);
    }

    public static void main(String[] args) {
        StudentDataWithBlankFinalVariable obj = new StudentDataWithBlankFinalVariable(342);
        obj.myMethod();
    }
}
