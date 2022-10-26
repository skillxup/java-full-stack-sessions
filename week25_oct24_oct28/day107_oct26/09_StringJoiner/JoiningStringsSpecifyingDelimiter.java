import java.util.StringJoiner;

class JoiningStringsSpecifyingDelimiter {
    public static void main(String[] args) {
        // passing hyphen (-) as delimiter
        StringJoiner mystring = new StringJoiner("-");

        // joining multiple strings by using add() method
        mystring.add("Logan");
        mystring.add("Magento");
        mystring.add("Rogue");
        mystring.add("Storm");

        // displaying the output string
        System.out.println(mystring);
    }
}