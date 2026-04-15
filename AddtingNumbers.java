import java.util.Scanner;
public class AddtingNumbers  
{
    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the String :");
        String s1=scn.nextLine();
        int sum=0;
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(c>='0'&&c<='9')
            {
                int n=c-'0';
                sum=sum+n;

            }
        }
        System.out.println(sum);

    }
    
}
