import java.util.LinkedHashSet;
import java.util.Set;

public class Removing 
{
    public static void main(String[] args) 
    {
        String r="rajesh rajesh hello";
        Set<String> word=LinkedHashSet<String>();
        String [] s=r.split(" ");
        for (String y : s) {
            word.add(y);
            
        }
        System.out.println(word);

        
    }
    
}
/*for(int j=i+1;j<s.length;j++)
            {
                if(!s[i].contains(s[j]))
                {
                    a+=" "+ s[i];
                }
                else{
                    a+=" "+s[i];
                }
            }*/
