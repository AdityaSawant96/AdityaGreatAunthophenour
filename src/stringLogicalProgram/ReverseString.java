package stringLogicalProgram;

public class ReverseString {

	public static void main(String[] args) {
		String abc="Aditya Sawant";
		String str= abc+" ";
		String word="";
		String rev="";
		for(int i=0; i<str.length(); i++)
		{
		char ch[] =str.toCharArray();
			if(ch[i]!=' ')
			{
				word=word+ch[i];
			}
			else
			{
				rev=word+" "+rev;
				word="";
			}
		}
		System.out.println(rev);

	}

}
