package logical;

import java.util.Scanner;

public class ReverseTheString {

	
	public static void main(String[] args) 
	{
		//Pune-->enuP
		
		//take input from user

		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any String");
		String orgStr=sc.next();
		String revStr="";
		
		for(int i=orgStr.length()-1;i>=0;i--)
		{
			char t=orgStr.charAt(i);
			revStr=revStr+t;
			
		}
		System.out.println("Original String is "+orgStr);
		System.out.println("Reverse String is "+revStr);
		
		if(orgStr.equals(revStr))
		{
			System.out.println("String is Palindrome");
			
		}
		else 
		{
			System.out.println("String is not Palindrome");
			
		}

	}

}
