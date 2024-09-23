package javaQuestions;

import java.util.Scanner;

public class lowerUpperNumberCounter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int upper=0;
		int lower=0;
		int number=0;
		int special=0;
		int count =0;

		System.out.print("Enter any sentence including NumberLowerUpperCase&SpecialCharater: ");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		for(int i =0;i<s.length();i++)
		{
			if(s.charAt(i)!= ' ')
			{
				
				 count++;
			}
			
			if(s.charAt(i)>= 65 && s.charAt(i)<=90)
			{
				upper++;
			}else if(s.charAt(i)>= 97 && s.charAt(i)<=127)
			{
				lower++;
			}else if(s.charAt(i)>= 48 && s.charAt(i)<=57)
			{
				number++;
			}else
			{
				
				special++;
			}
		}
		System.out.println("UpperCase: "+upper);
		System.out.println("LoweCase: "+lower);
		System.out.println("Number: "+number);
		System.out.println("SpecialChar: "+special);
		
		System.out.println("A"+upper);
		System.out.println(""+lower);
		System.out.println("Number: "+number);
		System.out.println("SpecialChar: "+special);
		


	}

}
