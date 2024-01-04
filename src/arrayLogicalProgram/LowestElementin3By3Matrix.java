package arrayLogicalProgram;

public class LowestElementin3By3Matrix {

	public static void main(String[] args) {
int b[][]= {{4,5,6},{3,2,4},{6,2,1}};
//4 5 6  (0,0) (0,1) (0,2)
//3 2 4 (1,0) (1,1) {1,2)
//6 2 1 (2,0) (2,1) (2,2)

int LOW = b[0][0];
for(int i=0; i<3; i++)
{
	for(int j=0; j<3; j++)
	{
		if(b[i][j]<LOW)
		{
			LOW=b[i][j];
		}
	}
}
System.out.println(LOW);
	}

}
