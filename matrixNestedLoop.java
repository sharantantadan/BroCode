import java.util.Scanner;

public class matrixNestedLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int column;
        int row;
        char charecter;

        System.out.print("Enter No. of columns: ");
        column = sc.nextInt();

        System.out.print("Enter No. of Rows: ");
        row = sc.nextInt();

        System.out.print("Enter the element in ur matrix: ");
        charecter = sc.next().charAt(0);

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(charecter);
            }
            System.out.println();
        }
    }
}
