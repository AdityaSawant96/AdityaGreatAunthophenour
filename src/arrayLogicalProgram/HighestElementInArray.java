package arrayLogicalProgram;

public class HighestElementInArray {

	public static void main(String[] args) {
		int b[]= {24,34,67,100};
		int High;
		for(int i=0; i<4; i++)
		{
			//System.out.println(b[i]);
		}
		High=b[0];
		for(int j=1; j<4; j++)
		{
			if(b[j]>High)
			{
				High=b[j];
			}
		}
System.out.println(High);
	}

}
