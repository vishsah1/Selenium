package javaPractice;

public class evenANDodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {2,7,9,6,4,9};
		int even=0;
		int odd=0;
		//		System.out.println(a.length);

		System.out.println("Odd no");
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2 != 0) {
				odd++;
				System.out.println(a[i]);

			}
		}System.out.println("total odd: "+odd);
		System.out.println("Even no");
		for(int i=0; i<a.length;i++)
		{
			if(a[i]%2 == 0) {
				System.out.println(a[i]);

			}
		}
	}
}







