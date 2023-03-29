import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seller Name: ");
        String SellerName = scanner.nextLine();
        System.out.println("Sales ID: ");
        int salesID = scanner.nextInt();
        System.out.println("Sales Amount: ");
        double salesAmount = scanner.nextDouble();
        System.out.println("Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        if (salesAmount>=50000){
            System.out.println("Commission is: "+(salesAmount*0.35));
        } else if (salesAmount>=30000) {
            System.out.println("Commission is: "+(salesAmount*0.20));
        } else if (salesAmount>=20000) {
            System.out.println("Commission is: "+(salesAmount*0.10));
        } else if (salesAmount>=10000) {
            System.out.println("Commission is: "+(salesAmount*0.05));
        } else {
            System.out.println("Commission is: "+(salesAmount*0.02));
        }
    }
}
