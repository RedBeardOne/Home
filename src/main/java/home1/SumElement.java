package home1;

public class SumElement {
    public static void sumel(int number) {
        int sum = 0;
        int num;
        for (int i = 0; number != 0; i++) {
            num = number % 10;
            sum = sum + num;
            number = number / 10;
        }
        System.out.println("sum = " + sum);
    }
}
