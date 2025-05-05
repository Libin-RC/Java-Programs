package Array;

import java.util.Scanner;

public class move_the_zeros_to_end {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Size: ");
		int size=scan.nextInt();
		int arr_a[]=new int[size];
		System.out.println("Enter the array values: ");
		for(int i=0;i<size;i++) {
			arr_a[i]=scan.nextInt();
		}
		int j=0;
		for(int i=0;i<size;i++)
		{
			if(arr_a[i]!=0 && arr_a[j]==0) {
				int temp=arr_a[i];
				arr_a[i]=arr_a[j];
				arr_a[j]=temp;
			}
			if(arr_a[j]!=0) {
				j++;
			}
		}
		for(int i=0;i<size;i++) {
			System.out.println(arr_a[i]+" ");
		}
	}

}
