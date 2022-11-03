class WrapperClassObjectToPrimitive {
    public static void main(String[] args) {
        // creating wrapper class object
        Integer obj = new Integer(100);

        // converting the wrapper object to primitive
        int num = obj.intValue();

        System.out.println(num + " " + obj);
    }    
}
