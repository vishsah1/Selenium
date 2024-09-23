package starPattern;

public class damru {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		for(int i=1; i<=3; i++)
		{
			for(int j=4; j>=i;j--)
			{
				System.out.print
				(" ");
			}
			for(int k=1;k<=i;k++)
			{

				System.out.print("*");
			}
			for(int l=2; l<=i;l++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i = 1; i<= 4; i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int k=4; k >=i; k--)
			{
				System.out.print("*");
			}
			for(int l=3; l>=i;l--)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		
		for(int i =1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				
				if(i>=2 && j>=2 && i<=3 && j<=3)
				{
					System.out.print(" ");
				}else
					System.out.print("*");
					
			}
			System.err.println();
		}



	}

}
