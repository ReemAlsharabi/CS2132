/*
QUESTION 2 – EXERCISE 9.5 PAGE 361
(Use the GregorianCalendar class) Java API has the GregorianCalendar class in the java.util package, which you 
can use to obtain the year, month, and day of a date. The no-arg constructor constructs an instance for the current 
date, and the methods get(GregorianCalendar.YEAR), get(GregorianCalendar.MONTH), and 
get(GregorianCalendar.DAY_OF_MONTH) return the year, month, and day. Write a program to perform two tasks: 
* Display the current year, month, and day. 
* The GregorianCalendar class has the setTimeInMillis(long), which can be used to set a specified elapsed 
time since January 1, 1970. Set the value to 1234567898765L and display the year, month, and day. 
*/
import java.util.GregorianCalendar;
public class Q2
{
	public static void main(String[] args)
	{
		GregorianCalendar c1 = new GregorianCalendar();
		
		System.out.println("Part one");
		System.out.println("Current Year: " + c1.get(GregorianCalendar.YEAR) 
							+ "\nCurrent Month: " + c1.get(GregorianCalendar.MONTH) 
							+ "\nCurrent Day: " + c1.get(GregorianCalendar.DAY_OF_MONTH) );
		
		c1.setTimeInMillis(1234567898765L);
		System.out.println("\nPart two");
		System.out.println("Current Year: " + c1.get(GregorianCalendar.YEAR) 
		+ "\nCurrent Month: " + c1.get(GregorianCalendar.MONTH) 
		+ "\nCurrent Day: " + c1.get(GregorianCalendar.DAY_OF_MONTH) );
	}
}
