import java.util.Scanner;

public class UserInput
{
	public static void main(String[] args) 
	{
		//create scanner class object
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number:");
		int num1=sc.nextInt();
		System.out.println("Enter 2nd number");
		int num2=sc.nextInt();
		
		int sum=num1+num2;
		int sub=num1-num2;
		int mul=num1*num2;
		int div=num1/num2;
		int mod=num1%num2;
		System.out.println("Sumation= "+sum);
		System.out.println("Subtraction= "+sub);
		System.out.println("Multiplication= "+mul);
		System.out.println("Division= "+div);
		System.out.println("Modulus= "+mod);
		}
}