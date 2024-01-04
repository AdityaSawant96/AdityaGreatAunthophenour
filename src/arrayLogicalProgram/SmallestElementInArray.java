package arrayLogicalProgram;

public class SmallestElementInArray {

	public static void main(String[] args) {
int a[]= {12,2,45,67,1};
int low;
for(int i=0;i<5; i++)
{
	//System.out.println(a[i]);
}
low=a[0];
for(int j=1; j<5; j++)
{
	if(a[j]<low)
	{
		low=a[j];
	}
	
}
System.out.println(low);
	}

}
