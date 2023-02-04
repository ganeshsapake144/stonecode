package pattern;

public class EquilateralTringle_Downward_WithSpacing {

	public static void main(String[] args) 
	{
//		* * * * *
//		 * * * *
//		  * * *
//		   * *
//		    *
		
		int space =0; //no of space in first row
		int star =5;  //no of stars in first row
		for(int a=1; a<=5; a++)  //outer for loop
		{
			for(int b=1; b<=space; b++) //inner for loop
			{
				System.out.print(" ");
			}
			for(int c=1; c<=star; c++) //ineer for loop
			{
				System.out.print("* ");
				
			}
			System.out.println();
			space++;
			star--;
			
		}
		

	}

}
