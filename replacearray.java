import java.util.*;
class replacearray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int[] a = new int[50];
		System.out.println("Enter how many elements in the array:");
		int n,small,sum=0,i,r,ne;
		n=sc.nextInt();
		System.out.println("Enter the array:");
		for(i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the elements in the array to be replaced:");
		r=sc.nextInt();
		System.out.println("Enter the element to replace the existing element:");
		ne=sc.nextInt();
		for(i=0;i<n;i++)
		{
			if(a[i]==r)
				a[i]=ne;
		}
		for(i=0;i<n;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println();
	}
}
