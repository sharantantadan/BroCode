import java.util.Scanner;

public class switches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String day;
        System.out.println("Enter a Day");
        day = sc.nextLine();

        switch (day) {
            case "Monday" -> System.out.println("It is Boring");
            case "Tuesday" -> System.out.println("It is Boring");
            case "Wednersday" -> System.out.println("It is Boring");
            case "Thursday" -> System.out.println("It is Boring");
            case "Friday" -> System.out.println("It is Boring");
            case "Saturday" -> System.out.println("Getting better");
            case "Sunday" -> System.out.println("It is Fun day");
            default -> System.out.println(day + " Does not exist");
        }
        sc.close();
    }
}
