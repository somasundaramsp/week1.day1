package week1.day1.assignments;

public class Factorial {
	
	public static void main(String agrs[])
	{
		int i, a, f=1;
		int no=5;
		for(i=1;i<no;i++)
		{
			f=f*i;
		}
		
		System.out.println("The Factorial of " +no+" is: "+f);
	}

}
