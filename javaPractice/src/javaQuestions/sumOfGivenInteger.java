package javaQuestions;

public class sumOfGivenInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 567; int num=0; 
		int digit;

		while(a>0)
		{
//			System.out.println(a%10);
			digit = a%10;
			num =  num+digit;
			a = a/10;
		}
		System.out.println("Sum  of Integer 567 is: "+num);

	}

}
