public class Q3
{
	public static void main(String[] args)
	{
		char[] c1 = {'R', 'e', 'e', 'm'};
		char[] c2 = {'H', 'e', 'l', 'l', 'o'};
		char[] c3 = {'O', 'O', 'P'};
		
		MyString1 s1 = new MyString1(c1);
		MyString1 s2 = new MyString1(c2);
		MyString1 s3 = new MyString1(c3);
		MyString1 s4 = new MyString1(c3);

		
		System.out.println("Char at index 2 in s1 is: " + s1.charAt(2));
		
		System.out.println("\n-----------------------------------------\n");
		
		System.out.println("length of s2 is: " + s2.length());
		
		System.out.println("\n-----------------------------------------\n");

		System.out.println("substring 2 to 4 of s1 is: " + s1.substring(2,4));

		System.out.println("\n-----------------------------------------\n");

		System.out.println("s3 in lower case is: " + s3.toLowerCase());
		
		System.out.println("\n-----------------------------------------\n");

		System.out.println("s3 equals s4 is: " + s3.equals(s4));
		
		System.out.println("\n-----------------------------------------\n");

		System.out.println("values of 0 in all strings are: " + MyString1.valueOf(0));
		
	}
}
