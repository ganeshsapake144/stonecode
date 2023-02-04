package pattern;

public class AscDesc_IncreasingDescrening {

	public static void main(String[] args) 
	{
//		*
//		**
//		***
//		****
//		***
//		**
//		*
		
		int star =1; // Total no of star in first/Initial Row
		for(int i=1; i<=7; i++)  //outer for loop for total no of rows=7
		{
			for(int j=1; j<=star; j++)  // Inner for loop for the column
			{
				System.out.print("*");
				
			}
			System.out.println();
			//star++;
			if(i<4)   //if (i<=3)   // for Increasing star; star++
			{
				star++;
				
			}
			else    // For Decreasing star; star--
			{
				star--;
				
			}
				
		}
		

	}

}
