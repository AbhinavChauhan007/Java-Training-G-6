import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str,reverse = "";
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the input string: ");
		str = scan.next();
		for(int i = 0 ; i<str.length();i++)
		{
			reverse+=str.charAt(i);
		}
		if (str.equals(reverse))
		{
			System.out.println("String is Palindrome");
		}
		else
		{
			System.out.println("String is not Palidrome");
		}

	}

}
