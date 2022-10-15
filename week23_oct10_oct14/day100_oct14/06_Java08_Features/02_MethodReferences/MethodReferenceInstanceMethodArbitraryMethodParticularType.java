import java.util.Arrays;
class MethodReferenceInstanceMethodArbitraryMethodParticularType {
    public static void main(String[] args) {
        String[] stringArray = {"Steve", "Rick", "Adit", "Negan", "Lucy", "Sansa", "John"};
        Arrays.sort(stringArray, String::compareToIgnoreCase);
        for(String str: stringArray) {
            System.out.println(str);
        }
    }
}
