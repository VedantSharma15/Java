public class Assign3
{
	public static void main(String[] args)
	{
		int a[]= new int[21];
		int sum=0;
		for(int i=0;i<=20;i++)
		{
			a[i]=i;
			System.out.print(a[i]+" ");
		}
		for(int b:a)
		{
			sum+=b;
		}
		System.out.println("\nSum of array elements= "+sum);
		}
}