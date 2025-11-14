import java.util.*;

public class SummerJob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your pay rate per hour: ");  //we used double instead of float to be more precise, also so that we can have accurate answers
        double payRate = input.nextDouble();

        System.out.print("Enter number of hours worked per week: ");
        double hoursPerWeek = input.nextDouble();

        double grossIncome = payRate * hoursPerWeek * 5;
	System.out.println("Income before tax: $" + grossIncome);

        double tax = grossIncome * 0.14;
        double netIncome = grossIncome - tax;      // 14 percent tax is deducted from gross income
	System.out.println("Income after tax: $" + netIncome);

        double clothes = netIncome * 0.10;       //spending 10 percent tax on shopping clothes
	System.out.println("Money spent on clothes: $" + clothes);

        double supplies = netIncome * 0.01;
	System.out.println("Money spent on school supplies: $" + supplies);

        double remaining = netIncome - clothes - supplies;

        double savingsBonds = remaining * 0.25;    //bonds i bought
	System.out.println("Money spent on savings bonds: $" + savingsBonds);

        double parentBonds = savingsBonds * 0.50;    //bond parents bought
	System.out.println("Money parents spent on bonds: $" + parentBonds);
        

	 input.close();
         }
}
