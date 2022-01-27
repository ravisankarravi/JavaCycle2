import java .util.*;
	class sumarray{
		public static void main(String args[])
		{
					Scanner sc=new Scanner(System.in);
					System.out.println("Enter the number of elements of array");
					int n=sc.nextInt();
					int[] array=new int[10];
					System.out.println("Enter the elements of the array");
					for(int i=0;i<n;i++)
					{
						array[i]=sc.nextInt();
					}
					int sum=0;
					for(int i=0;i<=n;i++)
					{
						sum=sum+i;
					}
					System.out.println("Sum of all the elements of an array:" +sum);
					
		
		}
	}
