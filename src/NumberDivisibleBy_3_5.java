import java.util.Scanner;

public class NumberDivisibleBy_3_5 {  // program to print numbers between 1 to 100 which are divisble by 3 & 5

    public static void main(String[] args) {

        //Scanner scanner = new Scanner(System.in);

        System.out.println("\nDivided by 3: ");

        for (int i = 0; i <= 100; i++) {
            if (i % 3 == 0)

                System.out.println(i + ", ");
        }
        System.out.println("\nDivided by 5: ");

        for (int i = 0; i <= 100; i++) {

            if (i % 5 == 0) {
                System.out.println(i + ", ");
            }
        }

    }
}