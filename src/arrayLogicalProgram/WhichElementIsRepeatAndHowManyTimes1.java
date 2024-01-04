package arrayLogicalProgram;

public class WhichElementIsRepeatAndHowManyTimes1 {

	public static void main(String[] args) {
		int a[]= {10,10,34,45,45,32,34};
		int count =1;
		
		for(int i=0; i<a.length; i++)
		{
			int num1=a[i];
			if(num1==0)
			{
				;
			}
			else
			{
				for(int j=i+1; j<a.length;j++)
				{
					int num2=a[j];
					if(num1==num2)
					{
						count++;
						a[j]=0;
					}
				}
				System.out.println("Duplicate element in araay is:= "+a[i]+"count:= "+count);
				count=1;
			}
		}

	}

}
