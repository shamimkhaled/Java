
package problem_09;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        num.add(20);
        num.add(90);
        num.add(40);
        num.add(25);
        num.add(60);
        System.out.println("Before sorting number: "+num);
        System.out.println();
        Collections.sort(num);
        System.out.println("After sorting in ascending order: "+num);
        System.out.println();
        Collections.sort(num, Collections.reverseOrder());
        System.out.println("After sorting in descending order: "+num);
    }
}
