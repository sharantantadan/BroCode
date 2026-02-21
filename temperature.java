import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter temperature:");
        temp = sc.nextDouble();
        System.out.print("Enter unit of conversion(C/F) : ");
        unit = sc.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 9 / 5) + 32;
        System.out.print("Temperature after conversion is : " + newTemp + "" + unit);
        sc.close();
    }
}
