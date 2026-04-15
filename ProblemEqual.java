import java.util.Scanner;

public class ProblemEqual 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String [] r=s.split(" ");
        String y=" ";
        for(int i=0;i<r.length;i++)
        {
            for(int j=i+1;j<r.length;j++)
            {
                if(!r[i].equals(r[j]))
                {
                    y=y+r[i]+" ";
                }
            }
        }
        System.out.println(y);
        
    }
    
}
