package javaPractice;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//121
		String s = "123454321";
		String rs="";
		
		for(int i = s.length()-1; i>=0;i--) {
			rs=rs+s.charAt(i);	
		}
		System.out.println(rs);
		if(s.contains(rs)) {
			System.out.println("isPalindrome");
		}else {
			System.out.println("Paliundrome nhi hai");
		}

	}

}
