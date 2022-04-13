/*
(The Person, Student, Employee, Faculty, and Staff classes)
Design a class named Person and its two subclasses named Student and Employee.
Make Faculty and Staff subclasses of Employee.
A person has a name, address, phone number, and email address.
A student has a class status (freshman, sophomore, junior, or senior).
Define the status as a constant.
An employee has an office, salary, and date hired.
Use the Date class to create an object for date hired.
A faculty member has office hours and a rank.
A staff member has a title.
Override the toString method in each class to display the class name and the person’s name. 
Draw the UML diagram for the classes and implement them.
Write a test pro- gram that creates a Person, Student, Employee, Faculty, and Staff, and invokes their toString() methods. 
 */
public class Student extends Person
{
	private final static String STATUS1 = "freshman";
	private final static String STATUS2 = "sophomore";
	private final static String STATUS3 = "junior";
	private final static String STATUS4 = "senior";
	private String status;
	public Student() {}
	public Student(String n, Address a, String p, String e, String s)
	{
		super(n, a, p, e);
		status = s;
	}
	public static String getSTATUS1()
	{
		return STATUS1;
	}
	public static String getSTATUS2()
	{
		return STATUS2;
	}
	public static String getSTATUS3()
	{
		return STATUS3;
	}
	public static String getSTATUS4()
	{
		return STATUS4;
	}
	public void setStatus(String status)
	{
		this.status = status;
	}
	@Override
	public String toString()
	{
		return this.getClass() + "\nname: " + name;
	}
}
