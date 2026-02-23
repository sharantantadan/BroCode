public class logicalOp {
    public static void main(String[] args) {
        double temp = 100;
        boolean isSunny = false;

        if (temp > 0 && temp <= 100) {
            System.out.println("The weather is great!");

        } else if (temp > 0 && temp <= 100 && !isSunny) {
            System.out.println("the weather is sunny \n and great!");
        } else if (temp > 100 || temp < 100) {
            System.out.println("not bad!");
        }
    }
}
