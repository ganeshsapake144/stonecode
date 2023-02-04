package pattern;

public class Equilateral_Downward {

	public static void main(String[] args) 
	{
//		  *******
//		   *****
//		    ***
//		     *
		int space=0;
		int star=7;
		
		for(int i=1; i<=4; i++)  //outer for loop; rows=4
		{
			for(int j=1; j<=space; j++) //inner for loop
			{
				System.out.print(" ");
				
			}
			for(int j=1; j<=star; j++) //inner for loop
			{
				System.out.print("*");
				
			}
			System.out.println();
			space++;       //increment of space by 1
			star = star-2; //decrement of star by 2
		}
	

	}

}
