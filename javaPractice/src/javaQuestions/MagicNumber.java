package javaQuestions;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print("Enter no. : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int sum=0,rem=1;


			while(n>0)
			{
				rem = n%10;
				sum +=rem;
				n=n/10;
			}

		if(sum==1)
			System.out.println(n+": is Magic Number.");
		else
			System.out.println(n+": is Not Magic Number.");

	}

}
