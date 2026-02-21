import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary;
        double taxRate;
        System.out.println("Enter your Salary:");
        salary = sc.nextInt();
        taxRate = (salary >= 50000) ? 0.75 : 0.25;
        System.out.printf("Your have to pay %.2f %% tax on your salary", taxRate);
        sc.close();
    }
}
