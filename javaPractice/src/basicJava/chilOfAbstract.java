package basicJava;

public class chilOfAbstract extends abstractClass {
	
	@Override
	void run() {
		// TODO Auto-generated method stub
		System.out.println("bike running");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abstractClass ac = new chilOfAbstract();
		
		ac.changeGear();
		ac.run();
	}
}
