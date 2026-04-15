import java.util.Scanner;
public class MaxLetter 
{
    public static void main(String[] args) 
    {
        Scanner scn= new Scanner(System.in);
        System.out.print("Enter the String :");
        String s1=scn.nextLine();
        char [] a=s1.toCharArray();
        int result=0;
        int r=0;
        char c=' ';
        for(int i=0;i<a.length;i++)
        {
            int count=0;
            for(int j=0;j<a.length;j++)
            {
                if(a[i]==a[j])
                {
                    count++;
                    

                }
            }
            r=count;
            if(result<r)
            {
                result=count;
                c=a[i];
            }
        }
        System.out.println(result+" "+c);

        
    }
    
}
