import java.util.Scanner;

public class Assign5
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		int age=sc.nextInt();
		System.out.println((age>=18)?"You are eligible":"You are not eligible");
	}
}