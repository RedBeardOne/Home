package home1;

public class Max {
    public static void max(int x, int y, int z) {
        int max;
        if (x > y) {
            max = x;
        } else {
            max = y;
        }
        if (max > z) {
            System.out.println("max = " + max);
        } else {
            max = z;
            System.out.println("max = " + max);
        }

    }
}
