import java.util.Scanner;
public class LengthSubString 
{
    public static void main(String[] args) 
    {
        /*Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String r=" ";
        char [] a=s.toCharArray();
        for(int i=0;i<a.length-1;i++)
        {
            String y=" ";
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]!=a[j])
                {
                    r=r+i;
                }
                else break;
            }
            y=r;
            if(r.length()>=0)
            {
                if(y.length()>r.length())
                {
                    r=y;
                }

            }
        }
        System.out.println(r);*/

        Scanner scn=new Scanner(System.in);
        String s=scn.nextLine();
        String res="";
        for(int i=0;i<s.length()-1;i++)
        {
            char c=s.charAt(i);
            String s1=" ";
            s1+=c;
            for(int j=i+1;j<s.length;j++)
            {
                
            char c1=s.charAt(j);
            String s2=" ";
            s2+=c1;
            if(!s1 contains(c2+" "))
            {
                s1+=c2;
            }
            else break;

            }
        }

        
    }
    
}
