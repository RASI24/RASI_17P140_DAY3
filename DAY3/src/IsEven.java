import java.util.Scanner;

public class IsEven {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println(a+" "+"is a  even number");
		}
		else
		{
			System.out.println(a+" "+"is a  odd number");
		}
	}

}
