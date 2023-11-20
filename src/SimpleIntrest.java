

public class SimpleIntrest {

    public static void main( String args[]) {
        calculateintrest(100000, 20, 30);
        // System.out.println(ans);
    }

    public static double calculateintrest(int a, int b, int c) {
        Long p = Long.valueOf(a);
        Long r = Long.valueOf(b);
        Long t = Long.valueOf(c);
        Long s = p * r * t;
        double si = Double.valueOf(s);
        double ans = si / 100;
        System.out.println(ans);
        return ans;
    }

}
