package basicJava;

public class base2 {

	int x=100;
	private int y =200;
	static int z = 300;
	public static String str = "base2";
	
	base2(){
		this(6);
		System.out.println("base-2 constructor--");
	}
	
	base2(int x){
		System.out.println("base-2 constructor"+x);
	}
	
	public void base2Method() throws InterruptedException
	{
		System.out.println("base-2 Method");
		
		System.out.println("base-2 Method after sleep");
	}
	static void show()
	{
		System.out.println("static base2");

	}
}
