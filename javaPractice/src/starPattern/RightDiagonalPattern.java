package starPattern;

public class RightDiagonalPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=4; i++)
		{
			for(int j=3; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k =1; k<=i;k++)
			{
				if(i>=2 && k>1)
				{
					System.out.print(" ");
				}else
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
