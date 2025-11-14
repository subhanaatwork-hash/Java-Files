import java.util.Scanner;

public class Lab4Act5{
	public static void main(String [] args ){

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your first integar:");
	int a = input.nextInt();

	System.out.println("Enter your second integar:" );
	int b = input.nextInt();

	System.out.println("Enter your third integar:");
	int c = input.nextInt();

	if (a==b && b==c){
	System.out.println(3);
	}

	else if ( a==b || b==c || c==a){
	System.out.println(2);
	}

	else {
	System.out.print(0);
	}

	input.close();
	}
}



	 