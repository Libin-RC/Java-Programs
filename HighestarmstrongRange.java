package Self_Prep;

import java.util.Scanner;

public class HighestarmstrongRange {

	public static void main(String[] args) {
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number to begin: ");
		int begin_num=obj.nextInt();
		System.out.println("Enter the number to end: ");
		int end_num=obj.nextInt();
		int num=begin_num;
		int highest=0;
		while(num<end_num) {
			int c_num=num;
			int count =0;
			while(c_num>0)
			{
				c_num=c_num/10;
				count+=1;
			}
			//System.out.println(count);
			if(count==1) {
				if(num>highest) highest=num;
				System.out.println(num+" is an armstrong number");
			}
			else {
				int s_num=num;
				int sum=0;
				while(s_num>0) {
					int pro=1;
					int count_d=count;
					int individual=s_num%10;
					s_num=s_num/10;
					while(count_d>0) {
						pro=pro*individual;
						count_d--;
					}
					sum=sum+pro;
				}
				if(num==sum) {
					//System.out.println(sum);
					if(num>highest) highest=num;
					System.out.println(num+" is an armstrong number");
				}
			}
			
			num++;
		}
		System.out.println(highest+" is the greatest armstrong number");
		obj.close();
	}

}
