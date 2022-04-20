import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int a = 9, b = 2;
        findSmallest(a, b);
        Map map = new HashMap();
        map.put("Country1", 100);

    }

    public static int findSmallest(int a, int b) {
        System.out.print("Smallest number is " + Math.min(a, b));
        return Math.min(a, b);

    }

}
