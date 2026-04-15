public class RemoveingDuplicate
{
    public static void main(String[] args) 
    {
        String s="ramana";
        char c[]=s.toCharArray();
        String s1=" ";
        
        for(int i=0;i<c.length;i++)
        {
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i]==c[j])
                {
                    c[j]=' ';
                }
                
            }
        }
        for(int i=0;i<c.length;i++)
        {
            char c1=c[i];//Acessing the tochArray to char
            if(c1!=' ')
            {
                s1+=c1;

            }
        }
        System.out.println(s1);
        
    }
    
}
/*public class RemoveingDuplicate {
    public static void main(String[] args) {
        String s = "ramana";
        char[] c = s.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < c.length; i++) {
            boolean duplicate = false;
            for (int j = i + 1; j < c.length; j++) {
                if (c[i] == c[j] && c[i] != ' ') {
                    c[j] = ' ';
                    duplicate = true;
                }
            }
            if (!duplicate && c[i] != ' ') {
                result.append(c[i]);
            }
        }

        System.out.println(result);
    }
}*/

/**
 * RemoveingDuplicate
 */
/*public class RemoveingDuplicate 
{
    public static void main(String[] args) 
    {
        String s1="ramana";
        String s2=" ";
        String s3=" ";
        char [] c=s1.toCharArray();
        for(int i=0;i<c.length;i++)
        {
           
            for(int j=i+1;j<c.length;j++)
            {
                if(c[i]==c[j])
                {
                     s2 += c[i];
                }
                else
                {
                    s3+=c[j];
                }
            }

        }
        System.out.println(s3);
    }

    
}*/
/*
 import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String input = "hello";
        String result = removeDuplicates(input);
        System.out.println("String after removing duplicates: " + result);
    }

    public static String removeDuplicates(String input) {
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder output = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (!seen.contains(c)) {
                seen.add(c);
                output.append(c);
            }
        }

        return output.toString();
    }
}

 */

