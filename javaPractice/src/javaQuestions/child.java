package javaQuestions;

class child extends father
{
	public void bike() {
		System.out.println("honda_child");
	}

	public static void main(String[] args)
	{
		father f = new child();
		f.bike1();

	}
}
