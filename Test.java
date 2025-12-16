import java.util.Scanner;
public class Test {
    public static void  main(String[] args) {
        System.out.println("Введите два числа: ");

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int sum = a + b;
        System.out.println("Сумма: " + sum);
    }
}