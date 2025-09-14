/**
 * Name: Johnny Garcia
 * Date: 9/13/2025
* Purpose: Lab3 - 
*/

// Don't forget to import and declare a Scanner for user input.

import java.util.Scanner;

public class Lab3_Johnny_Garcia
{
    public static void main(String[] args) 
    {
        //Step 1 is to create scanner object and read input from the keyboard
        Scanner input = new Scanner(System.in);
        //Step 2 is to declare variables
        double initialValue;
        int years;
        double interestRate;
        double finalValue;

        //Step 3 prompt user to input initial value of home and assign it using scanner
        System.out.print("Please enter the initial value of the home: ");
        initialValue = input.nextDouble();

        //Step4. Prompt user to input number of elapsed years and assign it using scanner
        System.out.print("Please enter the number of elapsed years: ");
        years =input.nextInt();

        //Step 5 prompt and read interest rate 
        System.out.print("Please enter the interest rate: ");
        interestRate = input.nextDouble();

        //Step6 Convert interest rate from percentage to a decimal 0.06 to 6%
        interestRate = interestRate / 100;

        //Step7. Calculate final value of home using formula for compound interest Final value = P * (1 + r)^t
        finalValue = initialValue * Math.pow(1 + interestRate, years);

        //Step8 Display final result 
        System.out.printf("The final value of the home is: %.2f\n", finalValue);

        //Step9 Close scanner
        input.close();




    }
}