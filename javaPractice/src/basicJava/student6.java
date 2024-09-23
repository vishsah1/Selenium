package basicJava;

class Counter{  

	int x;
	int y;
	int z;
	int p;
	
	public Counter(int x1, int y1)
	{
		 x = x1;
		 y = y1;
	}
	
	public Counter(int x1, int y1,int z1)
	{
		this(x1,y1);
		z=z1;
	}
	
	public void run(int p) {
		System.out.println(p);
	}
	
	public void run() {
		System.out.println(x +" "+ y+" "+z);
		this.run(786);
	}
	
	public static void main(String[] args) {
		Counter c1 = new Counter(1,8,6);
		c1.run();
	}
} 




