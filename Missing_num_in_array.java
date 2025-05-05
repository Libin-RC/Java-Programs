package Array;

import java.util.Scanner;

public class Missing_num_in_array {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Size: ");
		int n=scan.nextInt();
		int arr_a[]=new int[n];
		System.out.println("Enter the array values: ");
		for(int i=0;i<n-1;i++) {
			arr_a[i]=scan.nextInt();
		}
		int r_sum=((n*(n+1))/2); //sum of n natural numbers
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr_a[i];
		}
		System.out.println("The missing number is: "+(r_sum-sum));
		
	}

}
