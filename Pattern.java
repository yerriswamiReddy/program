import java.util.Scanner;
public class Pattern 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the String :");
        String s=scn.nextLine();
        char[] c=s.toCharArray();
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<=i;j++)
            {
                
                
                System.out.print(c[j]);
                
            }
            System.out.println();
        }

        
    }

    
}
