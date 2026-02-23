import java.util.Scanner;

public class simpleCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1;
        double n2;
        double result = 0;
        char operator;

        System.out.println("SIMPLE CALCULATOR");
        System.out.print("Enter number 1:");
        n1 = sc.nextDouble();
        System.out.print("Enter the operator:(*,-,+,/,^)");
        operator = sc.next().charAt(0);
        System.out.print("Enter number 2:");
        n2 = sc.nextDouble();

        switch (operator) {
            case '+' -> result = n1 + n2;
            case '-' -> result = n1 - n2;
            case '*' -> result = n1 * n2;
            case '/' -> {
                if (n2 == 0) {
                    System.out.println("Invalid Operation");
                } else {
                    result = n1 / n2;
                }
            }
            case '^' -> result = Math.pow(n1, n2);
            default -> System.out.println("INVALID OPERATOR!!!");

        }
        System.out.println(result);
        sc.close();
    }
}