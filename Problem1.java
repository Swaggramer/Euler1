public class Problem1
{
	public static void main(String[] args)
	{
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
		for(int num=1;num<1000;num++)
		{
			if (num % 5 == 0)
			{
				sum = sum + num;
				System.out.println("Sum = " + sum);
			}
		}
		for(int num2 = 1; num2 < 1000; num2++)
		{
			if (num2 % 3 == 0)
			{
				sum1 = sum1 + num2;
				System.out.println("Sum1 = " + sum1);
			}
		}
		for(int dif = 1; dif < 1000; dif++)
		{
			if (dif % 15 == 0)
			{
				sum2 = sum2 + dif;
				System.out.println("Sum2 = " + sum2);
			}
		}
		System.out.println("\nTotal of Sum = " + sum);
		System.out.println("\nTotal of Sum1 = " + sum1);
		System.out.println("\nTotal of Sum2 = " + sum2);
		System.out.println("\nThe total is " + ((sum + sum1) - sum2));
	}
}
           