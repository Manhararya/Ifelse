import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Employee Name: ");
        String name = scanner.nextLine();
        System.out.println("Employee ID: ");
        int id = scanner.nextInt();
        System.out.println("Salary");
        double salary = scanner.nextDouble();
        double hra,da,ta,pf,grossSalary;
        hra = salary*0.10;
        System.out.println("HRA is: "+hra);
        da = salary*0.08;
        System.out.println("DA is: "+da);
        ta = salary*0.09;
        System.out.println("TA is: "+ta);
        pf = salary*0.20;
        System.out.println("PF is: "+pf);
        grossSalary = salary+hra+da+ta+pf;
        System.out.println("Gross Salary is: "+grossSalary);
    }
}
