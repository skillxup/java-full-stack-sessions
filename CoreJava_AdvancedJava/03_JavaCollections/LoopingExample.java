import java.util.*;
public class LoopingExample {
    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<Integer>();
        arrList.add(12);
        arrList.add(6);
        arrList.add(67);
        arrList.add(84);

        System.out.println("For Loop");
        for(int counter = 0; counter < arrList.size(); counter++) {
            System.out.println(arrList.get(counter));
        }

        System.out.println("Advanced for Loop");
        for(Integer num: arrList) {
            System.out.println(num);
        }

        System.out.println("While Loop");
        int count = 0;
        while(arrList.size() > count) {
            System.out.println(arrList.get(count));
            count++;
        }

        System.out.println("Iterator");
        Iterator iter = arrList.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
