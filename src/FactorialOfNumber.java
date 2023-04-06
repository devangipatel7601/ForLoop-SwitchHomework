import java.util.Scanner;

public class FactorialOfNumber {//program to find factorial of given number i.e Factorial of 6 is 1*2*3*4*5*6 =720

    public static void main(String[] args) {

       //creating object of scanner class
        Scanner scanner = new Scanner(System.in);

        //acknowledge user to gibe input
        System.out.println("Enter the number");

        int factorial = 1;  //initializing factorial variable

        int num = scanner.nextInt();      //storing number in variable using scanner class object

        for (int i = 1; i <=num ; i++) {

            factorial = factorial * i;

        }
        System.out.println("Factorial of given number is: " + factorial);
    }
}
