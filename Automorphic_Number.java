package Self_Prep;

import java.util.Scanner;

public class Automorphic_Number {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=obj.nextInt(),count=0,num1=num;
		int sqr=num*num;
		//count of num
		while(num>0)
		{
			num=num/10;
			count+=1;
		}
		int count1=count;
		//getting the last number based on the count
		float rev=0;
		while(count>0)
		{
			int a=sqr%10;
			rev=(rev+a)/10;
			count-=1;
			sqr=sqr/10;
		}
		//shifting the decimal points
		for(int i=0;i<count1;i++)
		{
			rev=rev*10;
		}
		//narrow typecasting(float-int)
		int rev1=(int)rev;
		System.out.println((num1==rev1)? num1+" is an automorphic number":
			num1+" is not an automorphic number");
	}

}
