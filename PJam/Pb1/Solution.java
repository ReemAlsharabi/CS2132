import java.util.Scanner;
public class Solution 
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		if (1 <= n && n<=500)
		{
			double[][] arr = new double[2][2];
			
			for (int i = 0; i < n; i++)
			{
				for(int j = 0; j < 2; j++)
				{
					for(int k = 0; k < 2; k++)
					{
						arr[j][k] = input.nextInt();
						if (arr[j][k] < 0 || arr[j][k] > 4)
							return;
					}
				    	
				}
				String result = null;
				int j = 0, k = 0;
				double p = (arr[j][k]/4.0 + arr[j+1][k+1]/4.0)  -  (arr[j][k+1]/4.0 + arr[j+1][k]/4.0) ;
				if ( p >= 1 )
					result = "FACE";
				else if ( p <= -1 )
					result = "ZOMBIE";
				else if (-1 < p && p< 1)
					result = "NOISE";
				System.out.println(result);
				
				j+=1;
				k+=1;
			}
		}
	}
}
