import java.util.Random;
import java.util.Scanner;

public class NumberGame 
{
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner scn=new Scanner(System.in);
			
			Random ran=new Random();
			int rannumber=ran.nextInt(9);
			int attempts = 3;
	        int score=0;
	        for(int i=1;i<=attempts;i++)
	        {
	        	int Number =scn.nextInt();
	        	if(Number==rannumber)
	        	{
	        		score+=10;
	        		System.out.println("you Socred"+" "+score);
	        	}
	        	else
	        	{
	        		attempts--;
	        		System.out.println("u have only"+attempts);
	        		
	        	}
	        }//varaprasad0855@gmail.com
	    

	}

    
}
