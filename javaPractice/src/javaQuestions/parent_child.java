package javaQuestions;

 class parent{
	public void run()
	{
		System.out.println("Fatrher");
	}
}
class parent_child extends parent {
	
	public void run()
	{
		System.out.println("Child");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		parent p = new parent_child();
		p.run();

	}

}
