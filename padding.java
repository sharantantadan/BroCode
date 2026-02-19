public class padding {
    public static void main(String[] args) {
        int i1 = 1;
        int i2 = 34;
        int i3 = 543;
        int i4 = 6321;

        System.out.printf("%05d\n", i1);
        System.out.printf("%05d\n", i2);
        System.out.printf("%05d\n", i3);
        System.out.printf("%05d\n", i4);

        System.out.printf("%5d\n", i1);
        System.out.printf("%5d\n", i2);
        System.out.printf("%5d\n", i3);
        System.out.printf("%5d\n", i4);

        System.out.printf("%-5d\n", i1);
        System.out.printf("%-5d\n", i2);
        System.out.printf("%-5d\n", i3);
        System.out.printf("%-5d\n", i4);
    }
}
