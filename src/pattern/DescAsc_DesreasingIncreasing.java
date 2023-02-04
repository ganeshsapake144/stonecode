package pattern;

public class DescAsc_DesreasingIncreasing {

	public static void main(String[] args) 
	{
//		  *****
//		  ****
//		  ***
//		  **
//		  *
//		  **
//		  ***
//		  ****
//		  *****
		
		//Step 1- count total no of rows=9; use outer for loop for no. of rows
		
		int star =5;  //count total no of star in first row
		for(int i=1; i<=9; i++)  //outer for loopused for no. of rows
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
				
			}
			System.out.println();
			//star;      
			if(i<5)       //OR (i<=4)   //For Descending star
			{
				star--;
			}
			else     //For Asending star
			{
				star++;
			}
		}
		  

	}

}
