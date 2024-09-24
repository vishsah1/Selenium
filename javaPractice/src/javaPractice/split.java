package javaPractice;

public class split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myStr = "Split,a,string,by,spaces,and,also,punctuation";

		String regix = "[,//]";
		String[] s = myStr.split(regix);
		for(String l:s)
		{
			System.out.println(l);
		}
		
		
		
		
		
		
	}

}
