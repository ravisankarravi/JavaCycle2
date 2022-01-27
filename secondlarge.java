import java.util.*;
class secondlarge
{
	public static void main(String args[])
	{
		int a[]=new int[50];
		int i,j,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of elements in the array");
		int n=sc.nextInt();
		System.out.println("Enter array elements");
		for(i=0;i<n;i++)
			a[i]=sc.nextInt();
		for(i=0;i<2;i++)
			for(j=0;j<n-i-1;j++)
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
		System.out.println("Second largest element of the array is "+a[n-2]);
	}
}
