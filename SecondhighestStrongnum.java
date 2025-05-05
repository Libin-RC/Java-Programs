package Self_Prep;
import java.util.Scanner;

public class SecondhighestStrongnum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int snum=scan.nextInt();
		int lnum=scan.nextInt();
		int firstHigh=0;
		int secondHigh=0;
		for(int i=snum;i<=lnum;i++) {
			int num1=i,num=i,check=i;
			int count=0;
			while(num1>0) {
				num1=num1/10;
				count=count+1;
			}
			//System.out.println(count);
			int sum=0;
			for(int k=0;k<count;k++) {
				int fact=1;
				int l=num%10;
				for(int j=1;j<=l;j++) {
					fact=fact*j;
				}
				sum=sum+fact;
				num=num/10;	
			}
			if(sum==check) {
				System.out.println(sum);
				if(firstHigh<sum) {
					secondHigh=firstHigh;
					 firstHigh=sum;
				}
				if(sum>secondHigh && sum <firstHigh) {
					secondHigh=sum;
				}
			}
			//System.out.println((sum==check)? check+" is a strong number":check+" is not a strong number");
		}
		System.out.println(secondHigh);
		
	}

}
