package numberPattern;

public class pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=4 ; i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int k=i; k>=1; k--)
			{
				System.out.print(k);
			}
			for(int l = 2 ; l<=i; l++)
			{
				System.out.print(l);
			}
			System.out.println();
		}
		for(int i=1; i<=4 ; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(" ");
			}
			for(int k=3; k>=i; k--)
			{
				System.out.print(k);
			}
			for(int l = 2 ; l<=2; l--)
			{
				System.out.print(l+1);
			}
			System.out.println();
		}
		

	}

}
