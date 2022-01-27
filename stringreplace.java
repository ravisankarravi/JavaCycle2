import java.util.*;
class stringreplace
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
				System.out.println("Enter the string");
		String a = sc.nextLine();
		int len = a.length();
		int i;
		
				System.out.println("Enter the character to be replaced: ");
		char s = sc.next().charAt(0);
		
				System.out.println("Enter the character to replace the existing character: ");
		char r = sc.next().charAt(0);
		
				a = a.replace(s,r);
				
			
				System.out.println("String after replacing : ");
				System.out.println(a);
	}
}