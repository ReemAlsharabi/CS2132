import java.util.Scanner;

public class Solution
{
    private String item;
    private double price;
    private char category;
    
    public Solution(String i, double p, char c)
    {
        item = i;
        price = p;
        category = c;
    }
    
    public static void main(String[] args)
    {
        Solution []menu = new Solution[7];
        
        for (int i = 0; i < 7; i++)
        {
            menu[0] = new Solution("Cheeseburger", 40, 'F');
            menu[1] = new Solution("Sandwich", 80, 'L');
            menu[2] = new Solution("Cheesecake", 70, 'F');
            menu[3] = new Solution("Pizza", 70, 'R');
            menu[4] = new Solution("Falafel", 60, 'R');
            menu[5] = new Solution("Eggroll", 35, 'F');
            menu[6] = new Solution("Burrito", 90, 'F');

        }
                         
        
        Scanner input = new Scanner(System.in);
        int CC = input.nextInt();;
        int MC = input.nextInt();
        if (CC <= MC)
        {
            int busyness = CC*100/MC;
            if (busyness <= 50)
            {
                for (int i = 0; i < 7; i++)
                {
                    if (menu[i].category == 'R')
                        menu[i].price = menu[i].price - (menu[i].price*0.2);
                    else if (menu[i].category == 'L')
                        menu[i].price = menu[i].price - (menu[i].price*0.5);
                }
            }
            else if (busyness>50)
            {
                for (int i = 0; i < 7; i++)
                {
                    if (menu[i].category == 'F')
                        menu[i].price = menu[i].price + (menu[i].price*busyness/100);
                    else if (menu[i].category == 'R')
                        menu[i].price = menu[i].price + (menu[i].price*0.25);
                }
            }
            
            for (int i = 0; i < 7; i++)
                System.out.println((int)menu[i].price);
        }
        
    }
}
