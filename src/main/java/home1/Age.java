package home1;

public class Age {
    public static void age(int year) {
        int age;
        int del = 100;
        if (year % del == 0) {
            System.out.println("age = " + (age = year / del));
        } else {
            age = (year / del) + 1;
            System.out.println("age = " + age);
        }
    }
}
