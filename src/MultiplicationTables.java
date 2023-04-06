import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {  //program to print multiplication tables

          //creating scanner class object
        Scanner scanner = new Scanner(System.in);

         //acknowledge user to give input
        System.out.println("Enter any number in int value");

        int a = scanner.nextInt(); //storing number in variable using scanner object

    { for (int i=1; i<=12; i++)
    {

        System.out.println( a+" X " + i + " = " + (a*i));

    }
}
    }
}



