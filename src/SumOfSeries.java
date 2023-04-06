import java.util.Scanner;

public class SumOfSeries {          //program to calculate sum of 1+1/2+1/3+1/4....+1/n

    public static void main(String[] args) {

         //creating object of scanner class
        Scanner scanner = new Scanner(System.in);

        //acknowledge user to give input
        System.out.println("Enter the limit");

        int n = scanner.nextInt(); //storing n in variable using scanner object

        double sum = 0.0;   //initializing sum

        for (int i = 1; i <= n; i++)
        {
            sum = sum + 1.0/i;   //format for sum of series

        }
        System.out.println("Sum of Series = " +sum);
    }
}
