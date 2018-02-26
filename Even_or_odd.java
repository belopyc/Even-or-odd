import java.util.Scanner;

public class Even_or_odd{

    public static void main( String[] args ) {
        Scanner in = new Scanner(System.in);
 	System.out.println(" Even or odd ");
	System.out.println("Enter number: ");
        int divident= in.nextInt();
int result = divident % 2;
if(result > 0)
{
	System.out.println("Odd");
}
if(result == 0)
{
	System.out.println("Even");
}
 	
	}
}