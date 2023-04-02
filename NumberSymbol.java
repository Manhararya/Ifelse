import java.util.Scanner;

public class NumberSymbol {
    //hello
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any Character: ");
        char ch = scanner.next().charAt(0);

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            System.out.println(ch + " is a alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a number");
        } else {
            System.out.println(ch + " is a symbol");
        }
    }
}
