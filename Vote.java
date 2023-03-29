import java.util.Scanner;

public class Vote {

    public void eligibleForVote() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");

        int age = scanner.nextInt();
        if (age>=18) {
            System.out.println("You are eligible for vote as your age "+age+" is above 18");
        }else {
            System.out.println("You are not eligible for vote as your age "+age+" is under 18");
        }
    }
    public static void main(String[] args) {
        Vote vote = new Vote();
        vote.eligibleForVote();
    }
}
