import java.util.*;
class stringpalindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
		String a = sc.nextLine();
		int len = a.length();
		int i,j,flag=0;
		for(i= len -1,j=0; i>=0&&j<len ;i--,j++)
			{
	  			if(a.charAt(i)!=a.charAt(j))
					{
						flag = -1;
						break;
					}
			}
		if(flag==-1)
			{
				System.out.println("Not palidrome");	
			}
			else
				System.out.println("Palindrome");
	}
}
/*
Output
Enter the string
EEE
Palindrome
*/
