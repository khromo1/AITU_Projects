import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //task1
        int num1 = sc.nextInt();
        printDigits(num1);

        //task2
        int n2 = sc.nextInt();
        int[] arr = new int[n2];
        inputArray(arr, 0, sc);
        System.out.println((double) sum(arr, n2) / n2);

        //task3
        int num3 = sc.nextInt();
        if (isPrime(num3, 2))
            System.out.println("Prime");
        else
            System.out.println("Composite");

        //task4
        int num4 = sc.nextInt();
        System.out.println(factorial(num4));

        //task5
        int num5 = sc.nextInt();
        System.out.println(fib(num5));

        //task6
        int a = sc.nextInt();
        int n6 = sc.nextInt();
        System.out.println(power(a, n6));

        //task7
        int n7 = sc.nextInt();
        reversePrint(n7, sc);
        System.out.println();

        //task8
        String s8 = sc.next();
        if (isDigits(s8, 0))
            System.out.println("Yes");
        else
            System.out.println("No");

        //task9
        String s9 = sc.next();
        System.out.println(length(s9));

        //task10
        int a10 = sc.nextInt();
        int b10 = sc.nextInt();
        System.out.println(gcd(a10, b10));
    }

    //task1
    public static void printDigits(int n) {
        if (n == 0) return;
        printDigits(n / 10);
        System.out.println(n % 10);
    }

    //task2
    public static void inputArray(int[] arr, int i, Scanner sc) {
        if (i == arr.length) return;
        arr[i] = sc.nextInt();
        inputArray(arr, i + 1, sc);
    }

    public static int sum(int[] arr, int n) {
        if (n == 0) return 0;
        return arr[n - 1] + sum(arr, n - 1);
    }

    //task3
    public static boolean isPrime(int n, int i) {
        if (n <= 2) return n == 2;
        if (n % i == 0) return false;
        if (i * i > n) return true;
        return isPrime(n, i + 1);
    }

    //task4
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    //task5
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }

    //task6
    public static long power(int a, int n) {
        if (n == 0) return 1;
        return a * power(a, n - 1);
    }

    //task7
    public static void reversePrint(int n, Scanner sc) {
        if (n == 0) return;
        int x = sc.nextInt();
        reversePrint(n - 1, sc);
        System.out.print(x + " ");
    }

    //task8
    public static boolean isDigits(String s, int i) {
        if (i == s.length()) return true;
        if (!Character.isDigit(s.charAt(i))) return false;
        return isDigits(s, i + 1);
    }

    //task9
    public static int length(String s) {
        if (s.equals("")) return 0;
        return 1 + length(s.substring(1));
    }

    //task10
    public static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}