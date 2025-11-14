import java.util.Scanner;

public class Lab7Task4{
	public static void main (String [] args ){
	Scanner input = new Scanner(System.in);
	

	System.out.println("Which operation number you want to perform?");

	int numberToPrint = input.nextInt();
	
	
	switch(numberToPrint){
		case 1 : 
		System.out.printf(" **********" + " %n **********" + "%n **********");
		break;
		case 2 : 
		System.out.printf("*" + "%n**" + "%n***" + "%n****" + "%n*****");
		break;
		case 3 : 
		System.out.printf("%-*" + "%-n**" + "%-n***" + "%-n****" + "%-n*****");
		break;
		case 4 : 
		System.out.printf("The fourth operation will be performed");
		break;
		case 5 : 
		System.out.printf("The fifth operation will be performed");	
		break;
		}

		input.close();
}
}

		
	
