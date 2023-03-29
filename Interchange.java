import java.util.Scanner;

public class Interchange {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of A B C and D are: ");
        a = scanner.nextInt();
        b = scanner.nextInt();
        c = scanner.nextInt();
        d = scanner.nextInt();
        System.out.println("Before swapping number is: "+a+ " "+b+" "+c+" "+d);
        a = b;
        b = c;
        c = d;
        d = a;
        System.out.println("After swapping number is: "+a+ " "+b+" "+c+" "+d);
    }
}
