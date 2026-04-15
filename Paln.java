import java.util.*;
public class Paln 
{
    public static void main(String[] args) 
    {
        String temp="";

        String s1="rar";
        Scanner scn=new Scanner(s1);
        scn=scn.useDelimiter("");
        while (scn.hasNextLine()) {
            String s2=scn.next();
            temp=s2+temp;
            
        }
        if(temp.equals(s1))
        {
            System.out.println("true");
        }
        
    }
    
}
