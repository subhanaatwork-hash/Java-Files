 import java.util.Scanner;
	public class ServiceYears{
		public static void main(String [] args ){
		Scanner input = new Scanner(System.in);

		System.out.println("Enter years of service of the employee");	
		int serviceYears = input.nextInt();
		
		if(serviceYears<3){
		System.out.println("You are not eligible for the bonus");
		}

		if(serviceYears >= 3){
		System.out.println("Enter your performance rating 1,2 or 3");
		int performanceRating = input.nextInt();
	
			if(performanceRating == 3){
			System.out.println("Bonus : $10,000");
			}
			else if(performanceRating == 2){
			System.out.println("Bonus: $5000");
			}
			else if(performanceRating == 1){
			System.out.println("Bonus: $2000");
			}
			else{
			System.out.println("Invalid rating! Please enter 1, 2 or 3.");
			}
}
}
}

			

		

		
			