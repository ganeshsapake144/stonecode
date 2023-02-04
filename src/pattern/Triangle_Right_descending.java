package pattern;

public class Triangle_Right_descending {

	public static void main(String[] args)
	{
//		*****
//		 ****
//		  ***
//		   **
//		    *
		
		 int space =0;  //on the first row there is no space, space=0;
		 int star =5;   //outer loop for the no of rows=5
		 
		 for(int i=1; i<=5; i++)
		 {
			 for(int j=1; j<=space; j++) //1st consider inner for loop for the space
			 {
				 System.out.print(" "); //use single space and on print for inner for loop
				 
			 }
			 for(int j=1; j<=star; j++)
			 {
				 System.out.print("*");
				 
			 }
			 System.out.println();
			 space++;
			 star--;
			 
		 }
		

	}

}
