public class HackerRankCode 
{
    public static void main(String[] args) 
    {
        String s="hello java";
        String []r=s.split(" ");
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c!=' ')
            {
                count++;
            }
        }
        System.out.println(count);
        for(int i=0;i<r.length-1;i++)
        {
            if(r[i]!=" ")
            {
                char [] c=r[i].toCharArray();
                if(c[0]<r[i+1].charAt(0))
                {
                    System.out.println("no");
                }
                else{
                    System.out.println("yes");
                }
            }
            
        }
        char []c=s.toCharArray();
        String e="";
        for(int i=0;i<c.length;i++)
        {
            if(i==0)
            {
                e=e+Character.toUpperCase(c[i]);

            }
            else if(c[i]==' ')
            {
                e=e+" "+Character.toUpperCase(c[++i]);
            }
            else{
                e=e+c[i];
            }
        }
        System.out.println(e);

               
    }
    
}
