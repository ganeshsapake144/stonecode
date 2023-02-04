package pattern;

public class EquilateralTringle_upward_WithSpacing {

	public static void main(String[] args) 
	{
//		   *
//		  * *
//		 * * *
//		* * * *
		
		int space=3;
		int star=1;
		for(int i=1; i<=4; i++)  //outer for loop for the no of rows
		{
			for(int j=1; j<=space; j++) //inner for loop for space
			{
				System.out.print(" ");
				
			}
			for(int j=1; j<=star; j++)  //inner for loop star
			{
				System.out.print("* ");
				
			}
			System.out.println();
			space--;
			star++;
			
		}

	}

}
