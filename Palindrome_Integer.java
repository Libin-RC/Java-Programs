package Self_Prep;

import java.util.Scanner;
	
public class Palindrome_Integer {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=obj.nextInt(),rev=0,num1=num;
		while(num>0)
		{
			rev=(rev+num%10)*10;
			num=num/10;
		}
		rev=rev/10;
		System.out.println(rev);
		System.out.println((rev==num1)? num1+" is a palindrome": num1+" is not a palindrome");
	}

}
