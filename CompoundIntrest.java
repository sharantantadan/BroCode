import java.util.Scanner;

public class CompoundIntrest {
    public static void main(String[] args) {
        double principle;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the principle amount:");
        principle = sc.nextDouble();
        System.out.println("Rate of Intrest:");
        rate = sc.nextDouble() / 100;
        System.out.println("Time taken to compound the principle amount:");
        timesCompounded = sc.nextInt();
        System.out.println("Time Duration taken:");
        years = sc.nextInt();

        amount = principle * Math.pow(1 + rate / timesCompounded, timesCompounded * years);
        System.out.printf("The amount after %d year/s is: %,.0f", years, amount);
        sc.close();
    }

}
