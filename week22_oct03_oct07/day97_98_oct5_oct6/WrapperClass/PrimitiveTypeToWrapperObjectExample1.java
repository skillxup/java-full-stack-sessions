class PrimitiveTypeToWrapperObjectExample1 {
    public static void main(String[] args) {
        // converting int primitive into Integer object
        int num = 100;
        Integer obj = Integer.valueOf(num);
        System.out.println(num + " " + obj);
    }
}