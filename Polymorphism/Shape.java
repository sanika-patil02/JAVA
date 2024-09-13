import java.util.*;
 abstract public class Shape {

	protected double x,y;
	
	public void getdata(){
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter value of x:");
	x=sc.nextDouble();
	
	System.out.println("Enter value of y:");
	y=sc.nextDouble();
	
	}	
			
	
abstract void compute_area();
			
			
}
