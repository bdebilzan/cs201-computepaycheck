package cs201.edu;

/*
Bryce DeBilzan
HOMEWORK 3 PROBLEM 4- "Compute a Paycheck"
Asks user to enter their hourly wage and number of hours they worked in the past
week. Number of hours worked can be fractional. Overtime is paid at 150% of
regular hourly wage. Computes/displays paycheck for employee.
Does not accept negative values for any of the inputs.
*/

import java.util.Scanner;

public class HW03P04{
	public static void main(String[] args) {
		//Creates Scanner object
		Scanner in = new Scanner(System.in);
		
		double overtimePay = 0;
		
		//Asks for hourly wage
		System.out.print("What is your hourly wage? ");
		double hourlyWage = in.nextDouble();
		
		//Displays error message/exits if hourly wage is negative
		if (hourlyWage < 0)
		{
			System.out.println("Error: cannot be negative number.");
			System.exit(1);
		}
		
		//Asks for hours worked this week
		System.out.print("How many hours did you work this week? ");
		double hoursWorkedThisWeek = in.nextDouble();
			
		//Displays error message/exits if hours worked this week is negative
		if (hoursWorkedThisWeek < 0)
		{
			System.out.println("Error: cannot be negative number.");
			System.exit(1);
		}
		
		//Computes regular pay
		double regularPay = hoursWorkedThisWeek * hourlyWage;
		
		//Computes overtime pay
		if (hoursWorkedThisWeek > 40)
		{
			regularPay = 40 * hourlyWage;
			overtimePay = (hoursWorkedThisWeek - 40) * (hourlyWage * 1.5);
		}
		
		//Computes total pay
		double totalPay = overtimePay + regularPay;
		
		//Displays results
		System.out.println("");
		System.out.println("Hourly Wage: \t" + "$" + hourlyWage);
		System.out.println("Hours Worked: \t" + hoursWorkedThisWeek);
		System.out.println("");
		System.out.println("Regular Pay: \t" + "$" + regularPay);
		System.out.println("Overtime Pay: \t" + "$" + overtimePay);
		System.out.println("Total Pay: \t" + "$" + totalPay);
		}
	}