
public class Triangle extends GeometricObject {
	
	//Data declared	
	private double side1 = 1.0, side2 = 1.0, side3 = 1.0;
	
	//no arg constructor created
	public Triangle()
	{
		
	}
	//constructor created
	public Triangle(double side1, double side2, double side3)
	{
		
	}
	//get/set methods based from data above
	public void setSide1(double newSide)
	{
		side1 = newSide;
	}
	
	public double getSide1()
	{
		return side1;
	}
	
	public void setSide2(double newSide)
	{
		side2 = newSide;
	}
	
	public double getSide2()
	{
		return side2;
	}
	
	public void setSide3(double newSide)
	{
		side3 = newSide;
	}
	
	public double getSide3()
	{
		return side3;
	}
	 @Override
	  public String toString() {
	    return "Triangle: side1 = " + side1 + " side2 = " + side2 + " side3 = " + side3;
	 }

	  //From Abstract method getArea 
	  public double getArea(){
		  
		  double s = (side1 + side2 + side3)/2;
			double area = Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
			return area;
	  }

	  //From Abstract method getPerimeter
	  public double getPerimeter(){
		  
		  double perimeter = side1 + side2 + side3;
			return perimeter;
		  
	  }

}
