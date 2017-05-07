import java.util.Scanner;

public class Project_13_1 {
	
	public static void main(String[] args){
		
		//Asks user for side lengths, color and if object is filled or not. Then inputs info into objects.
				Triangle triangle1 = new Triangle();
				Scanner input = new Scanner(System.in);
				System.out.println("please enter the length of side1 of the triangle: ");
				triangle1.setSide1(input.nextDouble());
				System.out.println("please enter the length of side2 of the triangle: ");
				triangle1.setSide2(input.nextDouble());
				System.out.println("please enter the length of side3 of the triangle: ");
				triangle1.setSide3(input.nextDouble());
				System.out.println("please enter the color of the triangle: ");
				triangle1.setColor(input.next());
				System.out.println("Do you want the triangle to be filled? Enter True or False: ");
				triangle1.setFilled(input.nextBoolean());
		
				
				//Outputs various info gathered about triangles.
				System.out.printf(triangle1.toString() + "%nThe color of the triangle is " + triangle1.getColor() 
				+ ". %nIs the triangle filled: " + triangle1.isFilled() + "%nThe area of this triangle is " + 
						triangle1.getArea() + " and its perimeter is " + triangle1.getPerimeter());
	}

}
