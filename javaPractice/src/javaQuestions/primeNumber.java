package javaQuestions;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n; int count=0;
		System.err.print("Enter a Number: ");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();

		for(int i =1;i<=n; i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println(n +": is a Prime Number");
		}
		else
		{
			System.out.println(n +": is not a Prime Number");
		}
	}

}
