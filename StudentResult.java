import java.util.Scanner;

public class StudentResult {
    public void grade(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student Name :"+"\n"+"Roll Number :"+"\n"+"Maths Marks :"+"\n"+"Science Marks :"+"\n"+"English Marks: ");
        String studentName = scanner.nextLine();
        int rollNumber = scanner.nextInt();
        int mathsMarks = scanner.nextInt();
        int scienceMarks = scanner.nextInt();
        int englishMarks = scanner.nextInt();
        int total = (mathsMarks+scienceMarks+englishMarks);
        double percentage;
        percentage = ((total/3));
        System.out.println("Total marks is: "+total);
        System.out.println("Percentage is: "+percentage);

        if(percentage>=70)
        {
            System.out.println("Grade Dist");
        } else if (percentage>=60)
        {
            System.out.println("Grade FirstClass");
        } else if (percentage>=50)
        {
            System.out.println("Grade SecondClass");
        } else if (percentage>=35)
        {
            System.out.println("Grade PassClass");
        } else
        {
            System.out.println("Fail");
        }
    }

    public static void main(String[] args) {
        StudentResult studentResult = new StudentResult();
        studentResult.grade();
    }
}
