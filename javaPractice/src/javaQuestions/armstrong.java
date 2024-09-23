package javaQuestions;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num= 153;int temp=num; int digit; int sum =0;
		
		while(num>0)
		{
//			System.out.println(num%10);
			digit = num%10;
			sum = sum+ (digit*digit*digit);
			num =num/10;
		}
		if(temp==sum)
		{
			System.out.println("Armstrong No: "+ sum);
		}
		else
			System.out.println("na");
		

	}

}
