import java.util.Scanner;
public class MinLetter 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the string :");
        String s1=scn.nextLine();
        char [] c=s1.toCharArray();
        char e=' ';
        int result=Integer.MAX_VALUE;
        int r=0;
        for(int i=0;i<c.length;i++)
        {
            int count =0;
            for(int j=0;j<c.length;j++)
            {
                if(c[i]==c[j])
                {
                    count++;
                }

            }
            r=count;
            if(r<result)
            {
                result=count;
                e=c[i];

                
            }


        }
         System.out.print(e+" "+result);
       
        
    }
    
}
