import java.util.Scanner;

public class CalculatorWithSwitch {   //program to create calculator using switch

    public static void main(String[] args) {

       //creating object of scanner class
        Scanner scanner = new Scanner(System.in);

        //acknowledge user to give input
        System.out.println("Enter First Number:");
        double num1 = scanner.nextDouble();          //storing number in variable using scanner object

        System.out.println("Enter Second Number");
        double num2 = scanner.nextDouble();

        //ask user to enter operator
        System.out.println("Enter '+' or '-' or '*' or '/' ");
        char symbol = scanner.next().charAt(0);

        switch(symbol)
        {
            case '+':          // for addition
                double add = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + add);
                break;
            case '-':         //for subtraction
                double sub = num1 - num2;
                System.out.println(num1 + " - " + num2 + " = " + sub);
                break;
            case '*':      //for multiplication
                double multi = num1 * num2;
                System.out.println(num1 + " * " + num2 + " = " + multi);
                break;
            case '/':           //for division
                double div = num1 / num2;
                System.out.println(num1 + " / " + " = " + div);
                break;
            default:   //for any other symbol
                System.out.println("Invalid Entry");
        }
    }
}
