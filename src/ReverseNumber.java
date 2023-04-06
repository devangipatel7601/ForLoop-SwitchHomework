import java.util.Scanner;

public class ReverseNumber {  //program to reverse a number

    public static void main(String[] args) {

        //creating scanner class object
        Scanner scanner = new Scanner(System.in);

        //acknowledge user what to enter
        System.out.println("Enter the number: ");

        int num = scanner.nextInt();   //storing number in variable using scanner class

        int reverse = 0;  //initializing reverse

        for (;num != 0; num = num/10) {

            int remainder = num % 10;

            reverse = reverse*10 + remainder;  //this format for reverse any number

        }
        System.out.println("The reverse of the given number is: " + "\n" + reverse);

    }
}
