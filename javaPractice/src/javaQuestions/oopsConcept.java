package javaQuestions;

//abstraction
interface boy{
	public void run();
}

//encapsulitation
class monkey{
	//data-hiding
	private String name;
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String newName)
	{
		name = newName;
	}
}

//inheritance
class animal extends monkey implements boy
{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("This is overRide method- " + super.getName());
	}
	
	public void run(String str) {
		System.out.println(str+ "------This is overLoad method- ");
		
	}
}

public class oopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		animal a = new animal();
		a.setName("rambo");
		a.run();
		a.run("Bhalu");

	}

}
