package arrayLogicalProgram;

public class ArrayInAsendingOrder {

	public static void main(String[] args) {
		int a[]= {23,12,54,34};
		int temp;
		for(int i=0; i<4; i++)
		{
			//System.out.println(a[i]);
			
			
			int num1= a[i];
			
			for(int j=i+1; j<4; j++)
			{
				int num2=a[j];
				
				if(a[i]> a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
			}
			System.out.println(a[i]);
		}

	}

}
