package arrayLogicalProgram;

public class WhichElementIOsRepeatAndHowManyTImes {

	public static void main(String[] args) {
		int b[]= {11,11,11,45,45,65,34,43};
		int count =1;
		
		for(int i=0; i<b.length; i++)
		{
			int num1=b[i];
			if(num1==0)
			{
				
			}
			else
			{
				for(int j=i+1; j<b.length;j++)
				{
					int num2=b[j];
					
					if(num1==num2)
					{
						count++;
						b[j]=0;
					}
				}
				System.out.println("Duplicate element in Array Is:= "+b[i]+"COUNT:= " +count);
count=1;
			}
			
		}

	}

}
