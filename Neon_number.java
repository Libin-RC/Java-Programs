package Self_Prep;

import java.util.Scanner;

public class Neon_number {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=obj.nextInt();
		int sqr=num*num;
		int sum=0;
		while(sqr>0)
		{
			int a=sqr%10;
			sum=sum+a;
			sqr=sqr/10;
		}
		//System.out.println(sum);
		System.out.println((num==sum)? num+" is a neon number": num+" is not a neon number");

	}

}
