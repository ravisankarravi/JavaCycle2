import java.util.*;
class trace
{
	public static void main(String args[])
	{
		int i,j,sum=0;
		int a[][]=new int[50][50];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows");
		int row=sc.nextInt();
		System.out.println("Enter number of columns");
		int col=sc.nextInt();
		System.out.println("Enter array elements:");
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				a[i][j]=sc.nextInt();
		for(i=0;i<row;i++)
			for(j=0;j<col;j++)
				if(i==j)
				{
					sum=sum+a[i][j];
				}
		System.out.println("Trace of matrix is "+sum);
	}
}
/*
Output
Enter number of rows
2
Enter number of columns
2
Enter array elements:
1
2
3
4
Trace of matrix is 5
*/
