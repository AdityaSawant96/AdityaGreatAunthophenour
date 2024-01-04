package stringLogicalProgram;

public class PalindromeString {

	public static void main(String[] args) {
		String ak="Madam";
		String ac=ak.toLowerCase();
		String rev="";
		for(int i=0; i<ac.length(); i++)
		{
			char ch=ac.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
		if(ac.equals(rev))
		{
			System.out.println("Palindrome String");
		}
		else
		{
			System.out.println("Not a Palindrome String");

		}
					

	}

}
