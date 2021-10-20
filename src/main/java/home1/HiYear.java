package home1;

public class HiYear {
    public static void leap(int year) {
        if (year % 4 == 0 && !(year % 400 == 0)) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not leap year");
        }
    }
}
