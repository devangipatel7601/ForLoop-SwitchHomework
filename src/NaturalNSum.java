import java.util.Scanner;

public class NaturalNSum {  //program to display n natural numbers and their sum

    public static void main(String[] args) {

        //creating scanner class object
        Scanner scanner = new Scanner(System.in);

         //acknowledge user what to enter
        System.out.println("Enter the Number");

        int n = scanner.nextInt();   //storing number in variable using scanner class

        int sum = 0;  //initializing sum variable

        System.out.println("Natural numbers from 1 to "+n+" are: ");

        for (int i=1; i<=n; i++)
        {
            System.out.println(i);
        }
        for(int i=1; i<=n; i++)
        {
            sum = sum +i;
        }

        System.out.println("The Sum of "+n+" natural numbers is: " + sum);


    }
}
