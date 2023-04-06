import java.util.Scanner;

public class TenNumbersRange{  //program to find range of numbers between 2 input values


    public static void main (String[] args)
    {
        //creating scanner class object
        Scanner scanner = new Scanner(System.in);

         //to acknowledge user to input 1st value
        System.out.println("Enter Starting value: ");

        int a =scanner.nextInt();   //using obj for variable a

        //to acknowlege user to input 2nd value
        System.out.println("Enter Ending value: ");

        int b = scanner.nextInt();    //storing value in variable using scanner object


         //to find range between 2 values
        System.out.println("Numbers in range are: ");
         int count = 0;
        for (int i = a; i < b; i++)
        {
            if (count<10)
            {
            System.out.println(i);
            count++;
            }

        }

        }


    }



