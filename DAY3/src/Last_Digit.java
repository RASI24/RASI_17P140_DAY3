import java.util.Scanner;

public class Last_Digit {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("PLEASE ENTER THE NUMBER");
		
		int number,savenumber;
		number =sc.nextInt();
		savenumber=number%10;
		System.out.println("last digit of the given number is:"+savenumber);
	}

}
