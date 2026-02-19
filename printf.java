import java.util.*;

public class printf {

    public static void main(String[] args) {
        String name = "Sharan";
        char first = 'S';
        int age = 22;
        double height = 6.6;
        boolean isEmployed = true;

        System.out.printf("my name is %s \n", name);
        System.out.printf("First char is %c \n", first);
        System.out.printf("my age is %d \n", age);
        System.out.printf("ur height of %f \n", height);
        System.out.printf("first letter of %s is %c , who is %d years old and %f feet tall \n", name, first, age,
                height);

    }
}