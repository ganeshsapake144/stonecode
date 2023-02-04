package pattern;

public class ButterFly {

	public static void main(String[] args) 
	{
//		 *         *
//		 **       **
//		 ***     ***
//		 ****   ****
//		 ***** *****
//		 ****   ****
//		 ***     ***
//		 **      ***
//		 *         *    (Remember -> star space space star)
		
		int star =1;  //star on the first row left
		int space =5; //space on the first row left
		int star2 =1; //star on the first row right
		int space2 =4;//space on the first row right
		
		for(int i=1; i<=9; i++)  //outer for loop used for no. of rows =9
		{
			for(int j=1; j<=star; j++)  //Inner for loop for star(Left)
			{
				System.out.print("*");
				
			}
			for(int k=1; k<=space; k++) //Inner for loop for space (Left)
			{
				System.out.print(" ");
			}
			for(int m=1; m<=space2; m++)
			{
				System.out.print(" ");
			}
			for(int l=1; l<=star2; l++)
			{
				System.out.print("*");  //Inner for loop for star (Right)
			}
			if(i<5)
			{
				star++;
				space--;
				star2++;
				space2--;
				
			}
			else
			{
				star--;
				space++;
				star2--;
				space2++;
				
			}
			System.out.println();
			
		}
		 

	}

}
