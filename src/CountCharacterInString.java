import java.sql.SQLOutput;
import java.util.Scanner;

public class CountCharacterInString { //program to find no. of specific character from string

    public static void main(String[] args) {

     //creating object of scanner class
        Scanner scanner = new Scanner(System.in);

     //acknowledge user to give input
    System.out.println("Enter the Word or Sentence");

    String word = scanner.nextLine();   //storing word in variable using scanner class

    int letter = 0;  //initializing letter

        for (int i = 0; i < word.length() ; i++)
        {
            if(word.charAt(i)=='a')
            {
                letter++;
            }

        }
        System.out.println("Total Number of 'a' in above Word or Sentence is: " + letter);
    }

}
