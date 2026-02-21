import java.util.Scanner;

public class weight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double weight;
        double newWeight;
        int choice;

        System.out.println("WEIGHT CONVERSION:-");
        System.out.println("Choice 1: lbs to kgs");
        System.out.println("choice2: kgs to lbs");

        choice = sc.nextInt();

        if (choice == 1) {
            System.out.print("Enter weight in lbs:");
            weight = sc.nextDouble();
            newWeight = weight * 0.45;
            System.out.printf("the New weight is : %.2f kgs", newWeight);

        } else if (choice == 2) {
            System.out.println("Enter weight in kgs");
            weight = sc.nextDouble();
            newWeight = weight * 2.20;
            System.out.printf("the New weight is : %.2f kgs", newWeight);
        } else {
            System.out.println("Your have entered INVALID choice");
        }
        sc.close();
    }
}
