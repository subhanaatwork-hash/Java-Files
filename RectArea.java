import java.util.Scanner;

	public class RectArea{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);
		
			System.out.println("Enter the length of rectangle 1:");
			int lengthRect1 = input.nextInt();

			System.out.println("Enter the width of rectangle 1:");
			int widthRect1 = input.nextInt();

			System.out.println("Enter the length of rectangle 2:");
			int lengthRect2 = input.nextInt();

			System.out.println("Enter the width of rectangle 2:");
			int widthRect2 = input.nextInt();

                        int areaRect1;
			int areaRect2;

			areaRect1 = (lengthRect1 * widthRect1);
                        areaRect2 = (lengthRect2 * widthRect2);

			if(areaRect1 > areaRect2){
			System.out.println("Area of rectangle 1 is greater than that of rectangle 2");
			}

			else if (areaRect1 == areaRect2){
			System.out.println("Both areas are same");
			}

			else{
			System.out.println("Area of rectangle 2 is greater");
			}

			input.close();
		}
	}

                        




