import java.util.Scanner;

public class Calculater {
    //hello
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int a = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        int b = scanner.nextInt();
        System.out.println("Choose Operator[1]-Addition [2]-Subtraction [3]-Multiplication [4]-Division ");
        int ch = scanner.nextInt();

        if (ch == 1){
            System.out.println("Answer: "+(a+b));
        } else if (ch == 2) {
            System.out.println("Answer: "+(a-b));
        } else if (ch == 3) {
            System.out.println("Answer: "+(a*b));
        } else if (ch == 4) {
            System.out.println("Answer: "+(a/b));
        }
    }
}
