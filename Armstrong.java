package Method;

import java.util.Scanner;

public class Armstrong {
	
	public static boolean isArmstrong(int num) {
			int c_num=num,count =0;
			while(c_num>0)
			{
				c_num=c_num/10;
				count+=1;
			}
			if(count==1)return true;
			else {
				int s_num=num,sum=0;
				while(s_num>0) {
					int pro=1,count_d=count,individual=s_num%10;
					s_num=s_num/10;
					while(count_d>0) {
						pro=pro*individual;
						count_d--;
					}
					sum=sum+pro;
				}
				if(num==sum)return true;
			}
			return false;
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		boolean result=isArmstrong(num);
		System.out.println(result);
		scan.close();
	}
}
