import java.util.Scanner;

public class SumOfNaturalNumbers {   //program to print sum of natural numbers
    public static void main(String[] args) {

       //object of scanner class
    Scanner scanner = new Scanner(System.in);

      //acknowledge user to input integer value
        System.out.println("Enter the number ");

        int num = scanner.nextInt();   //storing number in variable using scanner object


        int sum = 0;  // initializing sum variable



        for (int i= 1; i <=num; i++)
        {
            //adding value of i into sum variable
            sum = sum + i;    //whenever you want to do addition use this format

        }
        //prints the sum
        System.out.println("Sum of Natural Numbers is = " +sum);



}

}
