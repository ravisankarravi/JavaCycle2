import java.util.*;
class smallestnumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int[] array=new int[10];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		int min=array[0];
		for(int i=0;i<n;i++)
		{
			if(array[i]<min)
				min=array[i];
		}
		System.out.println("Smallest Element present in given array:"+min);
	}
	
}
