import java.util.Scanner;

public class FibonacciNumberSequence {  //1,1,2,3,5,8,13,21,34 ...add 2 previous numbers
    //method to print Fibonacci number
    public static void main(String[] args) {

        //declaring variables

       int a = 0;
       int b = 1;
       int c;
       int num;

        //acknowledge user to input value
        System.out.println("Enter the number ");

        Scanner scanner = new Scanner(System.in);  //create scanner object

        num = scanner.nextInt();   //use obj for variable max_num

        System.out.println("Fibonacci Sequence is : ");  //to print series

        for (int i = 1; i <=num; i++)
        {
            System.out.print( a +" ");
            c = a+b;
            a = b;
            b = c;

        }






    }
}
