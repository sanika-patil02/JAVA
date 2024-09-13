import java.util.*;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		int num;
	
	
		int flag=-1;
		
		    do
		    {
		    	System.out.println("Enter Number:");
		    	num=obj.nextInt();
		    }while(num<1);
		    
		    if(num == 1)
		    {
		    	flag = 0;
		    }
		    else
		    {
		        if(num%2 == 0)
		        {
		        	if(num == 2)
		        	{
		        		flag=1;
		        	}
		        	else
		        	{
		        		flag = 0;
		        	}
		        }
		        else
		        {
		        	int n=(int)Math.ceil(Math.sqrt(num));
		        	System.out.println(n);
		        	for(int i = 2 ;i<=n; i++)
		        	{
		        		if(num % i == 0)
		        		{
		        			flag=0;
		        			break;
		        		}
		        		else
		        		{
		        			flag=1;
		        		}
		        	}
		        }
		    }  
if(flag==1)
{
	System.out.println("Number is prime");
}
else
{
	System.out.println("Number is not prime");
}
		        		
}
}
