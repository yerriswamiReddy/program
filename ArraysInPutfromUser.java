import java.util.Scanner;
import java.util.Arrays;
public class ArraysInPutfromUser 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        int size =scn.nextInt();
        int [] b=new int[size];
        
        for(int i=0;i<size;i++)
        {
             b[i]=scn.nextInt();
            
        }
        for (int i : b) 
        {
            System.out.print(i);
            
        }
        for(int j=0;j<b.length;j++)
        {
            boolean flage=true;
            for(int i=2;i*i<=b[j];i++)
            {
                if(b[j]%i==0)
                {
                    flage=false;
                    break;
                }

            }
            if(flage)
            {
                System.out.println(b[j]);
            }
        }
        
        
    }
    
}
