import java.util.Scanner;


public class circle extends Shape{
	private double area;
	
	public void getdata(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of radius:");
		x=sc.nextDouble();
		
		
		
		}	
				
	
	public void compute_area(){
		area=3.142*x*x;
		System.out.println("Area of circle is:"+area);
	}

}
