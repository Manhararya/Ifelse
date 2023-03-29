import java.util.Scanner;

public class CityName {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter alphabet between A to F: ");
        char alphabet = input.next().charAt(0);

        if (alphabet == 'a'){
            System.out.println("Ahmedabad");
        } else if (alphabet == 'b') {
            System.out.println("Bombay");
        } else if (alphabet == 'c') {
            System.out.println("Chennai");
        } else if (alphabet == 'd') {
            System.out.println("Delhi");
        } else if (alphabet == 'e') {
            System.out.println("Elephanta");
        } else if (alphabet == 'f') {
            System.out.println("Faridabad");
        } else {
            System.out.println("Invalid entry");
        }
    }

}
