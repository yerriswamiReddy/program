import java.util.Scanner;
public class PrintingVowles 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the string :");
        String a=scn.nextLine();
        for(int i=0;i<a.length();i++)
        {
            char s=a.charAt(i);
            if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u')
            {
                char c=s;
                
                System.out.print(c);
            }

        }


        
    }
    
    
}
