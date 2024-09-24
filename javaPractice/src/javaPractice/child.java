package javaPractice;

public class child extends base {
	
	static void show(int a) {
		System.out.println("child Static method"+a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		base c = new child();
		c.show();
	}
}
