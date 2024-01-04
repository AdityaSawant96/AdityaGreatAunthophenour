package arrayLogicalProgram;

public class HighAndLowElementInArray {

	public static void main(String[] args) {
int b[]= {12,3,56,200};
int High;
int Low;
for(int i=0;i<4; i++)
{
	//System.out.println(b[i]);
}
High=b[0];
Low=b[0];
for(int j=1; j<4; j++)
{
	if(b[j]>High)
	{
		High=b[j];
	}
	if(b[j]<Low)
	{
		Low=b[j];
	}
}
System.out.println(+High+" ,"+Low);
	}

}
