import java.util.Scanner;

public class PrimeNumberOrNot {   //write a program to check given number is prime or not
    //prime no. is a no. that is divisible by 1 & iteslf, so only count == 2

    public static void main(String[] args) {

         //creating scanner class object
        Scanner scanner = new Scanner(System.in);

        //acknowledge user to give input
        System.out.println("Enter any number:");

        int num = scanner.nextInt();      //stroing number in variable using scanner object

        int count= 0;  //initializing count

        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                count++;
            }

        }
        if (count == 2)  //if number has only 2 divisors 1 and itself  e.g (1x7) for 7
        {
            System.out.println("It is a Prime Number");

        } else
        {
            System.out.println("It is not a Prime Number");
        }



    }

}
