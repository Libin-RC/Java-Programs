package Self_Prep;

import java.util.Scanner;

public class Harshad_number {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number ");
		int num=obj.nextInt(),sum=0,num1=num;
		while(num>0)
		{
			int a=num%10;
			sum=sum+a;
			num=num/10;
		}
		System.out.println((num1%sum==0)? num1+" is a harshad number":
			num1+" is not a harshad number");
	}

}
