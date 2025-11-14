import java.util.*;

public class TicketsSold {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

	//TICKETS

        System.out.print("Enter number of Class A tickets sold: ");
        int ticketsA = input.nextInt();

        System.out.print("Enter number of Class B tickets sold: ");
        int ticketsB = input.nextInt();

        System.out.print("Enter number of Class C tickets sold: ");
        int ticketsC = input.nextInt();

        System.out.print("Enter number of Class D tickets sold: ");
        int ticketsD = input.nextInt();

        //INCOMES

        int incomeA = ticketsA * 20;
	System.out.println("Income from Class A: $" + incomeA);

        int incomeB = ticketsB * 15;
	System.out.println("Income from Class B: $" + incomeB);
	
        int incomeC = ticketsC * 10;
	System.out.println("Income from Class C: $" + incomeC);
	
        int incomeD = ticketsD * 5;
	System.out.println("Income from Class D: $" + incomeD);

        int totalIncome = (incomeA + incomeB + incomeC + incomeD);
        System.out.println("Total Income: $" + totalIncome);

        input.close();
    }
}
