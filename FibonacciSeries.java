package week1.day1.assignments;

public class FibonacciSeries {
	 
	public static void main(String[] args) {
		
		int range=8;
		int firstNum=0;
		int secNum=1, sum;
		System.out.print("Fibonaci series are below\n"+range+"sum:");
		//System.out.print(sum);
		for (int i=1; i<range; i++)
		{
			System.out.print(firstNum +", ");
			sum=firstNum+secNum;
			secNum=firstNum;
			sum=secNum;
			//firstNum=secNum;
		}
			
		
	}
}


