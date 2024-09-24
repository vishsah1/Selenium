package javaPractice;

public class upperCaseLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		

		
		String s = "#HelloIam765432VishWajit";

		int len = s.length();
		int lower=0;
		int upper=0;
		int special=0;
		int number=0;

		for(int i= 0;i<len;i++) 
		{
			char ch = s.charAt(i);
			if(ch >= 'A' && ch <= 'Z')
			{
				upper++;
				//				upperChar = ch+upperChar;
			}else if(ch>= 'a' && ch<= 'z')
			{
				lower++;
				//				lowerChar =  lowerChar+ch;

			}
			else if(ch>= '0' && ch<= '9')
			{
				number++;
				//				number= number+s.charAt(i);
			}
			else {
				special++;
			}
		}
		System.out.println(lower);
		System.out.println(upper);
		System.out.println(number);
		System.out.println(special);
	}
}






