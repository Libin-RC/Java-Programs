package Method;

import java.util.Scanner;

public class SecondHighestAutomorphicNumber {
	public static void secondHighAuto(int snum, int lnum) {
		int h=0,sh=0;
		for(int i=snum;i<=lnum;i++) {
			int count=0,num=i,sqr=i*i;
			while(num>0)
			{
				num=num/10;
				count+=1;
			}
			int count1=count;float rev=0;
			while(count>0)
			{
				int a=sqr%10;
				rev=(rev+a)/10;
				count-=1;
				sqr=sqr/10;
			}
			for(int j=0;j<count1;j++)rev=rev*10;
			int rev1=(int)rev;
			if(i==rev1) { 
				//System.out.println(i);
				if(h<i) {
					sh=h;
					 h=i;
				}
				if(i>sh && i<h)sh=i;	
			}
		}
		System.out.println(sh);
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int snum=scan.nextInt();
		int lnum=scan.nextInt();
		SecondHighestAutomorphicNumber.secondHighAuto(snum,lnum);
		scan.close();

	}

}
