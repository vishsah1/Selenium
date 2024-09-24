package javaPractice;

public class highestOutOfTwoNumber {

	public static void main(String[] args) {
		int a=100;
		int b=200;
		int c=800;

		
		int r=	a>b?a:b;
		int s=	r>c?r:c;
		System.out.println(s);
	}
}

