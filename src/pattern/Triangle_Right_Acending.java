package pattern;

public class Triangle_Right_Acending {

	public static void main(String[] args)

	{
		
//		    * 
//		   **
//		  ***
//	     ****
//		*****
		int space=4; //space in first rows,space=4
		int star=1; //star in first row, star=1
		
		for(int i=1; i<=5; i++) //outer loop for no of rows =5
		{
			for(int j=1; j<=space; j++) //1st inner loop -->space
			{
				System.out.print(" ");  // dont use println()
				
			}
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			space--;
			star++;
			
		}
			
		
	

	}

}
