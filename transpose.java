import java.util.*;
class transpose
{
	public static void main(String args[])
	{
		int i,j;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows:");
		int row=sc.nextInt();
		System.out.println("Enter number of columns:");
		int col=sc.nextInt();
		int a[][]=new int[50][50];
		System.out.println("Enter array elements:");
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				a[i][j]=sc.nextInt();
		System.out.println("Transpose matrix is:");
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				System.out.println(a[j][i]);
	}
}
/*
Output
Enter number of columns:
3
Enter array elements:
1
2
3
4
5
6
7
8
9
Transpose matrix is:
1
4
7
2
5
8
3
6
9
*/
