import java.util.Scanner;

public class Lab7Task1{
	public static void main (String [] args ){
	Scanner input = new Scanner(System.in);

	int index = 1;
	int maxIndex = 0;
	
	int max = input.nextInt();

	while (true) {
	 int number = input.nextInt();
		if ( number ==0){
		break;
}
	        if ( number> max){

		max = number;
		maxIndex = index;
	}
		index ++;
	}
		System.out.println(maxIndex);
		input.close();
	}
}
	


	
	
	
		