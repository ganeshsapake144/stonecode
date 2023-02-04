package pattern;

public class Triangle_Left_Descending {

	public static void main(String[] args) 
	{
//		  *****
//		  ****
//		  ***
//		  **
//		  *
		
		//step 1--> count rows =5; count column=5
		
		int star=5; //no of star present in first row
		for(int i=1; i<=5; i++) //outer loop for rows
		{
			for(int j=1; j<=star; j++)  //inner for loop
			{
				System.out.print("*");
				
			}
			System.out.println();
			star--;
			
		}

	}

}
