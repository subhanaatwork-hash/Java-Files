import java.util.*;

public class LabTask2{

	public static void main(String[] args){
	Scanner console = new Scanner(System.in);
	 	
	//for length

 	int length;
	System.out.print("Enter the length; ");
  	length = console.nextInt();

        //for width

	int width;
	System.out.print("Enter the width; ");
	width = console.nextInt();

       //to compute Area
	
	int area;
	area = length * width ;
	System.out.println("Area = " + area);

	//to compute perimeter

	int perimeter;
	perimeter = 2 * ( length + width );
        System.out.println("Perimeter = " + perimeter);

       }
}
	