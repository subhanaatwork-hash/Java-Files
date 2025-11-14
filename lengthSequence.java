import java.util.Scanner;
	public class lengthSequence{
		public static void main (String [] args){

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a sequence of non-negative integars(end the sequence with zero):");
		
		int count = 0;

		while(true){
		int sequenceNumbers = sc.nextInt();
		if(sequenceNumbers ==0){
		break;
		}

		count++;
	}
	
		
		System.out.print("Length of the sequence(excluding zero)" + count);

		sc.close();
	}
}