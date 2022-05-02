import java.io.*;
class Test
{
static private void MinMax(int n)
{
	int d;
	int mini = Integer.MAX_VALUE;
	int maxi = Integer.MIN_VALUE;
	while (n != 0)
	{
		d = n % 10;
		mini = Math.min(mini,d);
		maxi = Math.max(maxi,d);
		n = n / 10;
	}

	System.out.println("The minimum number is: "+mini);
	System.out.print("The maximum number is: "+maxi);
}
public static void main(String[] args)
{
	int n = 4726;
	MinMax(n);
}
