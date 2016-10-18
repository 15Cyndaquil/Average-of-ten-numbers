/**
 * @author John Tyler Gafford
 * September 8th 2016
 * jtg2246@email.vccs.edu
 * This program is used to find the average of 10 numbers 
 * from user input with delimited by comma ","
 */
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Delimiter {
	public static void main(String[] args) throws FileNotFoundException{
		//Declaring the variables for numbers were finding the average for
		int num1,num2,num3,num4,num5,num6,num7,num8,num9,num10,sum;
		//Declaring the variable for user input
		String input;
		//Declaring the variable for the average and 10 so we can get an exact number output
		float avg,num;
		//Opening a scanner for user input
		Scanner keyboard = new Scanner(System.in);
		//Outputting text to prompt the user input
		System.out.println("\"Input 10 numbers with only a comma between them\"");
		//Accepting user input from keyboard
		input = keyboard.next();
		//Creating a new scanner with user input so we can use Delimiter to separate user input
		Scanner set = new Scanner(input);
		//Using Delimiter to separate user input
		set.useDelimiter(Pattern.compile(","));
		//setting first number to num1
		num1 = set.nextInt();
		//setting first number to num2
		num2 = set.nextInt();
		//setting first number to num3
		num3 = set.nextInt();
		//setting first number to num4
		num4 = set.nextInt();
		//setting first number to num5
		num5 = set.nextInt();
		//setting first number to num6
		num6 = set.nextInt();
		//setting first number to num7
		num7 = set.nextInt();
		//setting first number to num8
		num8 = set.nextInt();
		//setting first number to num9
		num9 = set.nextInt();
		//setting first number to num10
		num10 = set.nextInt();
		//Adding all the numbers together
		sum = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
		//Setting 10 as a float so we can get exact average output
		num = 10;
		//Calculating the average
		avg = sum / num;
		//Outputting the average using escape sequences
		System.out.println("\"The average of the numbers you inputed is "+ avg + "\"");
		//Outputting the author of delimiter
		System.out.println(keyboard.delimiter());
		//Closing Scanner keyboard
		keyboard.close();
		//Closing Scanner set
		set.close();
	}
}
