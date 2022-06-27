import java.util.Scanner;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution
{
    
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	String n = input.nextLine();
    	String m = input.nextLine();
    	int x = input.nextInt();

    	for(int i = 0; i <n.length(); i++)
            for(int j = i+1; j <n.length(); j++) 
                if(n.charAt(i) == n.charAt(j))
                {
                	System.out.println("-1");
        			return;
                }
                	
    	int length1 = n.length();
    	int length2 = m.length();
    	int stringProb = (int) Math.pow(length1, 3);
    	int numProb = (int) Math.pow(length2, x);
    	
    	int result = stringProb + numProb;
    	System.out.println(result);
    }
}
