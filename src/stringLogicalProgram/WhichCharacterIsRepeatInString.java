package stringLogicalProgram;

public class WhichCharacterIsRepeatInString {

	public static void main(String[] args) {

		String abc="Aditya Pandurang Sawant";
		String ak= abc.toLowerCase();
		char ch[]=ak.toCharArray();
		int count=0;
		for(int i=0; i<ch.length; i++)
		{
			for(int j=i+1;j<ch.length;j++ )
			{
				if(ch[i]==ch[j])
				{
					System.out.println("Duplicate element present in String:= "+ch[j]);
					break;
				}
			}
		}
	}

}
