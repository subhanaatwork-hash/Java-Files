import java.util.Scanner;
public class LabTask2Activity3
{ 
	
public static void main(String [] args)
        {
	 Scanner console = new Scanner(System.in);

 	 //named constants
	final int SECRET = 11;
	final double RATE = 12.50;

        //declarations
	int num1;
	int num2;
	int newNumber;
        String name;
	double hoursWorked, wages;

	System.out.print("Enter first integar:");
	num1 = console.nextInt();

	System.out.print("Enter second integar:");
	num2 = console.nextInt();

	System.out.println("The value of num1:" + num1 + "and the value of num2:" + num2);
	
	newNumber = (num1 * 2) + num2;
	newNumber = newNumber + SECRET;
	System.out.print("The updated value of newNumber = " + newNumber );

	System.out.print("Enter your last name: ");
	name = console.next();

	System.out.print("Enter the number of hours worked (0 - 70) : ");
	hoursWorked = console.nextDouble();
	  
	//for wages

	wages = RATE * hoursWorked;

	//results

	System.out.println();
	System.out.println("Pay Rate: $ " + RATE);
	System.out.println("Hours Worked: " + hoursWorked);
	System.out.println("Salary: $ " + wages);
	

	console.close();
	}
}



	
	
	
