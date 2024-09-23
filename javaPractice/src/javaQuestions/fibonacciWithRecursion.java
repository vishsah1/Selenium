package javaQuestions;

public class fibonacciWithRecursion {

	 int a=0;
	 int b=1;
	 int c;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		fibonacciWithRecursion fwr = new fibonacciWithRecursion();
		fwr.disp(10);
	}

	void disp(int i) 
	{
		if(i>=1)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
			disp(i-1);
		}
	}



}
