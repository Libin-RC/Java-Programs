package Array;

import java.util.Scanner;

public class Minimum_value_in_array {
	public static int secondSmallest(int arr[]) {
		int smallest=Integer.MAX_VALUE;
		int secSmallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				secSmallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]<secSmallest && arr[i]!=smallest) {
				secSmallest=arr[i];
			}
		}
		return secSmallest;
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Size: ");
		int size=scan.nextInt();
		int arr_a[]=new int[size];
		System.out.println("Enter the array values: ");
		for(int i=0;i<size;i++) {
			arr_a[i]=scan.nextInt();
		}
		/*int smallest=Integer.MAX_VALUE;
		for(int i=0;i<size;i++) {
			if(arr_a[i]<smallest) smallest=arr_a[i];
		}
		System.out.println(smallest);
		int second_smallest=Integer.MAX_VALUE;
		for(int i=0;i<size;i++) {
			if(arr_a[i]!=smallest && arr_a[i]<second_smallest) second_smallest=arr_a[i];
		}
		System.out.println(second_smallest);*/
		System.out.println(secondSmallest(arr_a));
	}

}
