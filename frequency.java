import java.util.*;
class frequency
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String to check the Frequency: ");
		String a = sc.nextLine();
		int n = a.length();
		a = a.toLowerCase();
		int count = 0,i;
		System.out.print("Enter the element whose frequency to be checked: ");
		char x = sc.next().charAt(0);
		for(i = 0; i<n ; i++)
		{
			if(x== a.charAt(i))
				count++;
				
		}
		System.out.println("The occurence of "+x+" is "+ count);
	}
}
/*
Output
Enter the String to check the Frequency: javaprogram
Enter the element whose frequency to be checked: a
The occurence of a is 3
*/
