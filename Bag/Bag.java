public class Bag {
	private double weight ;
	private String colour ;
	static private double total_weight ;
	static private int objects ;
	
	public Bag ()
	{
		weight = 2.5d ;
		colour = "blue" ;
		total_weight = total_weight + weight ;
		objects = objects + 1 ;
	}
	
	public Bag (double wgt)
	{
		weight = wgt ;
		colour = "blue" ;
		total_weight = total_weight + weight ;
		objects = objects + 1 ;
	}
	
	public Bag (String col)
	{
		colour = col ;
		weight = 2.5d ;
		total_weight = total_weight + weight ;
		objects = objects + 1 ;
	}
	
	public Bag (double wgt , String col)
	{
		weight = wgt ;
		colour = col ;
		total_weight = total_weight + weight ;
		objects = objects + 1 ;
	}
	
	public void display()
	{
		System.out.println(weight+"\t"+colour);
	}
	
	static public void output()
	{
		System.out.print("Total Weight of Bag is : ");
		System.out.println(total_weight) ;
		System.out.print("No. of balls in bag are : ") ;
		System.out.println(objects) ;
	}
	
	public void Correction()
	{
		objects = objects - 1 ;
		total_weight = total_weight - weight ;
	}
	
	static public int count()
	{
		return objects ;  
	}
	
	/*static public int Swap(int s)
	{
		int temp,count;
		int Sr3 = s ;
		count = Bag.count() ;
		temp = S[count] ;
		while(count > Sr3 - 1)
		{	
			S[count] = S[count - 1] ;
			count -- ;
		}
		return temp ;
	}*/

}
