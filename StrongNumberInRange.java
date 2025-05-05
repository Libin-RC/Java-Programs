package Method;

import java.util.Scanner;

public class StrongNumberInRange {
	public static void strongRange(int snum, int lnum) {
		for(int i=snum;i<=lnum;i++) {
			int num=i,sum=0;
			while(num>0) {
				int fact=1,l=num%10;
				for(int j=1;j<=l;j++) {
					fact=fact*j;
				}
				sum=sum+fact;
				num=num/10;	
			}
			if(sum==i) System.out.println(i);
		}	
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int snum=scan.nextInt();
		int lnum=scan.nextInt();
		StrongNumberInRange.strongRange(snum,lnum);
		scan.close();
	}

}
