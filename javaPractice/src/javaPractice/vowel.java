package javaPractice;

public class vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String as = "aeibghou eruic cghj";
		
		String s = as.toLowerCase();
		
		int vowel=0;
		int cons=0;
		for(int i = 0; i<s.length();i++)
		{
			if(s.charAt(i)=='a' ||s.charAt(i)=='e' || s.charAt(i)=='i'|| s.charAt(i)=='o'|| s.charAt(i)=='u') 
			{
				vowel++;
				System.out.println("vowel: "+s.charAt(i));
				
			}else if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z')
			{
				cons++;
				System.out.println("cons: "+s.charAt(i));
			}
		}
		System.out.println("vowel: "+vowel);
		System.out.println("cons: "+cons);
		
	}
}


