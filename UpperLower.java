import java.util.Locale;
import java.util.Scanner;

public class UpperLower {
    //hello
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter alphabet in Uppercase: ");
        String string = scanner.nextLine();
        System.out.println("Before change: "+"\t"+string);
        System.out.println("After change: "+"\t"+string.toLowerCase(Locale.ROOT));

    }

}
