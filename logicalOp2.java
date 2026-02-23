import java.util.Scanner;

public class logicalOp2 {
    public static void main(String[] args) {
        String username;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Username(4-12 charecters):");
        username = sc.nextLine();

        if (username.length() < 4 || username.length() > 12) {
            System.out.println("User name must contain 4-12 charecters");
        } else if (username.contains(" ") || username.contains("_")) {
            System.out.println("User name must not contain SPACES or UNDERSCORES");
        } else {
            System.out.println("Welcome, " + username);
        }
        sc.close();
    }
}
