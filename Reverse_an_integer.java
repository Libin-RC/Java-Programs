package Self_Prep;

import java.util.Scanner;

public class Reverse_an_integer {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=obj.nextInt();
		int num1=num;
		//Integer method
		int rev=0;
		while(num>0)
		{
			int a=num%10;
			rev=rev+a;
			rev=rev*10;
			num=num/10;
		}
		rev=rev/10;
		System.out.println(rev);
		//String Method
		String revv="";
		while(num1>0)
		{
			int a=num1%10;
			revv=revv+a;
			num1=num1/10;
		}
		System.out.println(revv);
		
	}

}
