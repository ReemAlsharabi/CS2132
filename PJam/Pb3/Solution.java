import java.util.Scanner;

public class Solution
{
    
    public static void main(String[] args)
    {
    	int result = 0;
    	Scanner input = new Scanner(System.in);
    	int n = input.nextInt();
    	if (n > 0)
    	{
    		int []x = new int[n];
        	int []y = new int[n];
        	int []sum = new int[n-1];
        	for (int i = 0; i < n; i++)
        	{
        		x[i] = input.nextInt();
        		y[i] = input.nextInt();
        		if (!(0 <= x[i] && x[i]<= 1000000 && 0 <= y[i] && y[i]<= 1000000))
        		{
        			System.out.println("-1");
        			return;
        		}
        			
        	}
        	for (int i = 0; i < n-1; i++)
        	{
        		sum[i] = Math.abs(x[i] - x[i+1]) + Math.abs(y[i] - y[i+1]);
        		result+=sum[i];
        	}
        	System.out.println(result);
    	}
    	else
    		System.out.println("-1");
    	
    }
}
