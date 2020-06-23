import java.util.Scanner;

public class Secondlast_digit {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int number,a,b,c;
		System.out.println("enter the number");
		number=sc.nextInt();
		if(number>=9 )
		{
			a=number%100;
			b=a/10;
			c=Math.abs(b);
			System.out.println(c);
		}
		else
		{
			System.out.println("-1");
		}
		
	}

}
