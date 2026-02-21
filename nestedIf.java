public class nestedIf {
    public static void main(String[] args) {
        boolean isStudent = false;
        boolean isSenior = false;
        double price = 10.00;

        if (isStudent) {
            if (isSenior) {
                System.out.println("You are a senior and a student");
                System.out.println("You get a discount of 30%");
                price *= 0.7;
            } else {
                System.out.println("You are only a student");
                System.out.println("You get a discount of 10%");
                price *= 0.9;
            }
        } else {
            if (isSenior) {
                System.out.println("You are a senior");
                System.out.println("You get a 20% discount");
                price *= 0.8;
            } else {
                System.out.println("You are neither student nor senior");
            }
        }

        System.out.println("Final price: " + price);
    }
}