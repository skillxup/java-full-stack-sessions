import java.util.ArrayList;
public class AnotherExampleFindingArrayListSize {
    public static void main(String[] args) {
        ArrayList<String> cityList = new ArrayList<>();
        cityList.add("Delhi");
        cityList.add("Jaipur");
        cityList.add("Agra");
        cityList.add("Chennai");

        System.out.println("ArrayList of cityList: " + cityList);
        System.out.println("ArrayList Size of cityList: " + cityList.size());

        cityList.remove("Chennai");

        System.out.println("ArrayList of cityList: " + cityList);
        System.out.println("ArrayList Size of cityList: " + cityList.size());

    }
}
