
public class Triangle extends Shape {
	
	private double area;
	
	public void compute_area(){
		area=0.5*x*y;
		System.out.println("Area of Triangle is:"+area);
	}

}
