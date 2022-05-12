import java.util.Scanner;

public class Assign4 {
	public static void main(String[] args)
	{
		int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=s.nextInt();
		while (a>0)
		{
		sum+=a;
		System.out.println("Enter the number:");
		a=s.nextInt();
		} 
		System.out.println("Sum of number is= "+sum);
	}
}