public class Jpattern 
{
    public static void main(String[] args) 
    {
        String s="java is easy";
        String [] c=s.split("\\s+");
        for(String e:c)
        {
            System.out.println(e);
        }
        
    }
    
}
