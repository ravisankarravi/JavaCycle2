import java.util.*;
class largestelement
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		int i,j,l;
		System.out.println("Enter the number of rows");
		int m=obj.nextInt();
		System.out.println("Enter the number of columns");
		int n=obj.nextInt();
		int a [] [] = new int[20][20];
		System.out.println("Enter the elements");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				a[i][j]=obj.nextInt();
			}
		}
		l=a[0][0];
		for(i=0;i<m;i++)
			for(j=0;j<n;j++)
				if(a[i][j]>l)
				{
					l=a[i][j];
				}
				System.out.println("Large= "+l);
	}
}
