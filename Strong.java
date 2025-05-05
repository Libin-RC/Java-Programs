package Self_Prep;
import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt(),num1=num,check=num;
		int count=0;
		while(num1>0) {
			num1=num1/10;
			count=count+1;
		}
		//System.out.println(count);
		int sum=0;
		for(int i=0;i<count;i++) {
			int fact=1;
			int l=num%10;
			for(int j=1;j<=l;j++) {
				fact=fact*j;
			}
			sum=sum+fact;
			num=num/10;	
		}
		System.out.println((sum==check)? check+" is a strong number":check+" is not a strong number");
	}

}
