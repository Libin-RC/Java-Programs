package Self_Prep;

import java.util.Scanner;

public class Amicable_Numbers {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1=obj.nextInt();
		System.out.println("Enter the second number: ");
		int num2=obj.nextInt();
		int sum1=0;
		for(int i=1;i<num1;i++)
		{
			if(num1%i==0)
				sum1=sum1+i;
		}
		int sum2=0;
		for(int i=1;i<num2;i++)
		{
			if(num2%i==0)
			{
				sum2=sum2+i;
			}
		}
		System.out.println(((num1==sum2)&&(num2==sum1))?"Amicable":"Not amicable");
	}

}
