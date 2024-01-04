package arrayLogicalProgram;

public class ArrayInDesendingOrder {

	public static void main(String[] args) {
		int b[]= {459,678,127,3400};
		int temp;
		for(int i=0; i<4; i++)
		{
			//System.out.println(b[i]);
			
			
			int num1=b[i];
			for(int j=i+1; j<4; j++)
			{
				int num2=b[j];
				
				if(b[i]<b[j])
				{
					temp=b[j];
					b[j]=b[i];
					b[i]=temp;
				}
					
			}
			System.out.println(b[i]);
		}

	}

}
