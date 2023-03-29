import java.util.Scanner;

public class PassFail {
    Scanner scanner = new Scanner(System.in);
    //Student pass if he/she gets more than 35 marks in each subject.

    public void result() {
        System.out.println("\"Maths Marks :\"+\"\\n\"+\"Science Marks :\"+\"\\n\"+\"English Marks: \"");
        float average;
        int mathsMarks = scanner.nextInt();
        int scienceMarks = scanner.nextInt();
        int englishMarks = scanner.nextInt();
        int total = (mathsMarks + scienceMarks + englishMarks);
        average = ((total / 3));
        System.out.println("Your overall percentage is: " + average);
        if (((average >= 35) && (mathsMarks >= 35) && (scienceMarks >= 35) && (englishMarks >= 35)))
        {
            System.out.println("You are pass");
        } else
        {
            System.out.println("You are fail");
        }
    }


    public static void main(String[] args) {
        PassFail passFail = new PassFail();
        passFail.result();

    }


}