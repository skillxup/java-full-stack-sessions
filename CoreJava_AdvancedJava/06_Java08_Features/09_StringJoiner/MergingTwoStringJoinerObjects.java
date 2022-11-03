import java.util.StringJoiner;

class MergingTwoStringJoinerObjects {
    public static void main(String[] args) {
        StringJoiner mystring = new StringJoiner(",", "(", ")");

        // joining multiple strings by using add() method
        mystring.add("Logan");
        mystring.add("Magento");
        mystring.add("Rogue");
        mystring.add("Storm");

        System.out.println("First String: " + mystring);

        StringJoiner myanotherstring = new StringJoiner("-", "pre", "suff");

        // joining multiple strings by using add() method
        myanotherstring.add("Sansa");
        myanotherstring.add("Imp");
        myanotherstring.add("Jon");
        myanotherstring.add("Ned");

        System.out.println("Second String: " + myanotherstring);

        StringJoiner mergedString = mystring.merge(myanotherstring);
        System.out.println(mergedString);
    }    
}
