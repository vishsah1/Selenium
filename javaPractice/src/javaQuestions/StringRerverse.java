package javaQuestions;

public class StringRerverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  s = "dalda";
		String ns = "";
		
		int count = s.length()-1;
		
		for(int i = count; i>=0; i--)
		{
			ns+=s.charAt(i);
		}
		System.out.println(ns);
	}

}
