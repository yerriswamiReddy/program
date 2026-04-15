public class EachWordPanlenDroemOrNot 
{
    public static void main(String[] args) 
    {
        String s="eye level yerriswamy";
        String [] r=s.split("\\s+");
        for(String e:r)
        {
            System.out.println(palendrome(e)+" "+e);

        }
        
    }
    public static boolean palendrome(String s)
    {
        char [] c=s.toCharArray();
        int i=0; int j=c.length-1;
        while(i<j)
        {
            if(c[i]!=c[j])return false;
            i++;
            j--;

        }
        return true;
    } 
    
}
