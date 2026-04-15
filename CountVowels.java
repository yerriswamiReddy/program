import java.util.Scanner;
public class CountVowels 
{
    public static void main(String[] args) 
    {

        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the string :");
        String s1=scn.nextLine();
        int count=0;
        for(int i=0;i<s1.length();i++)
        {
            char c=s1.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                count++;

            }
        }
        System.out.println(count);
    }
    
}
