package javaQuestions;

import java.util.Scanner;

public class perfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int  n,sum=0;
		System.out.print("Enter no. : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

			for(int i=1; i<n;i++)
			{
				if(n%i==0)
				{
					sum++;
				}
			}
		if(sum==n)
			System.out.println(n+": is Perfect Number.");
		else
			System.out.println(n+": is Perfect Number.");


	}

}
