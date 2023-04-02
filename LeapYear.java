import java.util.Scanner;

public class LeapYear {
    //hello
    public void checkLeapYear(){
        //Type by keyboard
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year in 4 digit (e.g.= 1926)");
        //storing in year variable using scanner object
        int year = scanner.nextInt();
        //exactly divided by 4 (like 2012, 2016, 2020, 2024, etc.)
        //exactly divided by 400, then it is (like 1600, 2000, 2400, 2800)
        //exactly divided by 100, then it isn't (like 111111)
        if(((year%4==0)||(year%400==0))&&((year%100!=0)))
        {
            System.out.println("This is a leap year");
        } else {
            System.out.println("This is not a leap year");
        }
    }

    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear();
        leapYear.checkLeapYear();
    }
}
