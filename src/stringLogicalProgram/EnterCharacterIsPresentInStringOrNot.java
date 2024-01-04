package stringLogicalProgram;

import java.util.Scanner;

public class EnterCharacterIsPresentInStringOrNot {

	public static void main(String[] args) {
//String input
		int count=0;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter String := ");
		String s= scr.nextLine();
		
		
		//Character output
		
		Scanner scr1= new Scanner(System.in);
		System.out.println("Enter a Character:=");
		char ch=scr1.next().charAt(0);
		
		for(int i=1; i<s.length(); i++)
		{
			if(s.charAt(i)==ch)
			{
				count++;
				
			}
		}
		if(count>0)
		{
			System.out.println("Element is Repeat in String");
		}
		else
		{
			System.out.println("Element is not  Repeat in String");
		}
		}
		
	}


