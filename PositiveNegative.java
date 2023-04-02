import java.util.Scanner;

public class PositiveNegative {
    //hello
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        int givenNumber = scanner.nextInt();
        if (givenNumber>0)
        {
            System.out.println("Number "+givenNumber+" is positive");
        } else if (givenNumber<0)
        {
            System.out.println("Number "+givenNumber+" is negative");
        } else
        {
            System.out.println("Number "+givenNumber+" is zero");
        }
    }
}
