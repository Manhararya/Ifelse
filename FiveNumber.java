import java.util.Scanner;

public class FiveNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int no1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int no2 = scanner.nextInt();
        System.out.println("Enter third number: ");
        int no3 = scanner.nextInt();
        System.out.println("Enter forth number: ");
        int no4 = scanner.nextInt();
        System.out.println("Enter fifth number: ");
        int no5 = scanner.nextInt();
        int total = ((no1+no2+no3+no4+no5)/5);
        System.out.println("Average of this five number is: "+total);
    }
}
