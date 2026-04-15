import java.util.Scanner;
public class CountingWords 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the string :");
        String s1=scn.nextLine();
        String s2=s1.trim();
        int count=1;
        for(int i=0;i<s2.length();i++)
        {
            char c=s2.charAt(i);
            if(c==' ')
            {
                count++;
            }

        }
        System.out.println(count);

        
    }
    
}
