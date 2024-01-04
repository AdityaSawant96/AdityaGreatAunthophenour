package stringLogicalProgram;

import java.util.Scanner;

public class EnterCharacterPresentOnString {

	private static Object ch1;

	public static void main(String[] args) {
	//using Scanner class we get a string input
		int count=0;
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a String:= ");
		String s= scr.nextLine();
		
		//charaCTER INPUT
		Scanner scr1 = new Scanner(System.in);
		System.out.println("Enter a Character:= ");
		char ch=scr1.next().charAt(0);
		
		
		for(int i=0; i<s.length();i++)
		{
			
			if(s.charAt(i)==ch)
			{
				count++;
			}
		}
if(count>0)
{
	System.out.println("Enter character is present in String");
}
else
{
	System.out.println("Enter character not present in String");

}
	}

}
