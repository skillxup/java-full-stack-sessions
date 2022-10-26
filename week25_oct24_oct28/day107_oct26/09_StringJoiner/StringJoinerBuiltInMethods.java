import java.util.StringJoiner;

class StringJoinerBuiltInMethods {
    public static void main(String[] args) {
        // comma (,) as delimiter
        StringJoiner mystring = new StringJoiner(",");
        mystring.setEmptyValue("This is a default string");

        System.out.println("Default String: " + mystring);

        // joining multiple strings by using add() method
        mystring.add("Logan");
        mystring.add("Magento");
        mystring.add("Rogue");
        mystring.add("Storm");

        System.out.println(mystring);

        int length = mystring.length();
        System.out.println("Length of the StringJoiner: " + length);

        String s = mystring.toString();
        System.out.println("s: " + s);
    }    
}
