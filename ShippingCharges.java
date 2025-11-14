/*PSEUDOCODE:
	START
    DISPLAY "Enter the weight of the package: "
    INPUT weight
	IF weight <= 2 THEN
            rate = 1.10
        ELSE IF weight <= 6 THEN
            rate = 2.20
        ELSE IF weight <= 10 THEN
            rate = 3.70
        ELSE
            rate = 3.80
        ENDI
        charges = weight * rate
        DISPLAY "Shipping charges: $" + charges
    ENDIF
STOP*/

import java.util.Scanner;	
	public class ShippingCharges{
		public static void main(String [] args ){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the weight of the package:");
		double weightPackage = sc.nextDouble();

		double charges;

	if (weightPackage <= 2){
	charges = 1.10;
	}
	else if (weightPackage > 2 && weightPackage<=6){
	charges = 2.20;
	}
	else if (weightPackage > 6 && weightPackage <=10){
	charges = 3.70;
	}
	else {
	charges = 3.80;
	}

	System.out.printf("The shipping charge for %.2f pounds is: $%.2f%n", weightPackage, charges);

	sc.close();

}
}


		
			
