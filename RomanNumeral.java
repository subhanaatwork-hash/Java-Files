import java.util.Scanner;
	public class RomanNumeral{
		public static void main ( String [] args){
		
		Scanner input = new Scanner (System.in);

		System.out.print("Enter a number (1-10):");
		int number = input.nextInt();

			if(number >= 1 && number <=10){
			String roman;

				switch(number){
				case 1: roman = "I"; break;
				case 2: roman = "II"; break;
				case 3: roman = "III"; break;
				case 4: roman = "IV"; break;
				case 5: roman = "V"; break;
				case 6: roman = "VI"; break;
				case 7: roman = "VII"; break;
				case 8: roman = "VIII"; break;
				case 9: roman = "IX"; break;
				case 10: roman = "X"; break;
				default: roman = "";
				}

		System.out.print("Roman Numeral:" + roman);
		}
		        else{
			System.out.print("Error: Please enter a number between 1 and 10");
			}
		input.close();
 		}
}



