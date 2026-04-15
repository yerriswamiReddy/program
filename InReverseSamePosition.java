import java.util.Scanner;
public class InReverseSamePosition 
{
    
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the String :");
        String s=scn.nextLine();
        String [] a=s.split("\\s+");
        for(String r:a)
        {
            //reverser(r);
            System.out.print(reverser(r)+" ");
        }                
    }
        static String reverser(String  a)
        {
            char[] s=a.toCharArray();
            int i=0;
            int j=s.length-1;
            while(i<j)
            {
                char  temp=s[i];
                s[i]=s[j];
                s[j]=temp;
                i++;
                j--;

            }
            return new String(s);
        }  
    
}
