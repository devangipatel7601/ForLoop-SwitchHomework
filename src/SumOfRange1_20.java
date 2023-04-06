import com.sun.jdi.PathSearchingVirtualMachine;

import java.io.InputStream;
import java.util.Scanner;

public class SumOfRange1_20 {
    public static void main(String[] args){  //program to print sum of x ranging from 1 to 20

        //creating scanner class object
        Scanner scanner = new Scanner(System.in);

        //acknowledge user to give input
        System.out.println("Enter the First Number");

        int num1 = scanner.nextInt();  // storing number in variable using scannner object
        System.out.println("Number in Range are: ");

       int sum = 0;   //initializing sum

        for( int i=num1; i<=20; i++)
        {
            System.out.println(i);  //to print numbers in range

        }
     for(int i= num1; i<=20; i++)
     {
            sum = sum +i;   //for sum of numbers
        }
        System.out.println("Sum of Number ranging from "+num1+" to "+20+" is: " +sum);

    }


}

