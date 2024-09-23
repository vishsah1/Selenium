package javaQuestions;

public class NoOfCharactersInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "asdfghj";
		int count =0;
		char ch;
		
		
		for(int i=0; i< str.length(); i++)
		{
			if(str.charAt(i) != ' ')
			{
				count++;
			}
		}
		System.out.println(count);
		

	}

}
