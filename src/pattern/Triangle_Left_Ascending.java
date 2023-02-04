package pattern;

public class Triangle_Left_Ascending {

	public static void main(String[] args)
	{
		
//		*
//		**
//		***
//		****
//		*****
		
		//step 1:-> count rows= 05 count columns=05
		
		int star=1; //write no of star in first row
		for(int i=1; i<=5; i++) //outer for loop used for rows
		{
			for(int j=1; j<=star; j++) //inner loop for columns
			{
				System.out.print("*");
				
			}
			
			
		}
		 System.out.println(); //after printing star go on next line
		 star++;  //increment in stars
		 
		

	}

}
