package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String args[]) {
		
		int a,i,b=0,f=0;
		int d=13;
		b=d/2;
		
		if(d==0||d==1)
		{
		  System.out.println(d+ " is not prime");
		}
		else
		{
			for (i=2; i<b;i++)
			{
				if(d%i==0)
				{
					System.out.println(d+ " is not prime");
					f=1;
					break;
					
				}
					
			}
			if (f==0)
			{
				System.out.println(d+ " is prime");
			}
		}
	}
}
