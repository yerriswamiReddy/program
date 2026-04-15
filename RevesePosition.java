import java.util.Scanner;
public class RevesePosition 
{
    public static void main(String[] args) 
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the string :");
        String s=scn.nextLine();
        String [] r=s.split("");
        String s2="";
        for(int i=r.length-1;i>=0;i--)
        {
            s2+=r[i];
            //if(i>0)s2+=" ";

        }
        System.out.println(s2);
       
        
    }
    
}
