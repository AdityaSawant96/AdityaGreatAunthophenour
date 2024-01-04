package arrayLogicalProgram;

public class HighestElementIn3By3Matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b[][]= {{4,2,1}, {10,3,5}, {1,7,3}};
int high= b[0][0];
for(int i=0; i<3; i++)
{
	for(int j=0; j<3; j++)
	{
		if(b[i][j]>high)
		{
			high=b[i][j];
		}
	}
}
System.out.println(high);
	}

}
