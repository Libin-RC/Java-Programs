package Array;

import java.util.Scanner;

public class Resize_the_aray {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Size: ");
		int size=scan.nextInt();
		int arr_a[]=new int[size];
		System.out.println("Enter the array values: ");
		for(int i=0;i<size;i++) {
			arr_a[i]=scan.nextInt();
		}
		int arr_b[]=new int[size+5];
		for(int i=0;i<size;i++) {
			arr_b[i]=arr_a[i];
		}
		arr_a=arr_b;
		for(int i=0;i<size;i++) {
			System.out.print(arr_a[i]+" ");
		}
		System.out.println();
		System.out.println("Current length of the array: "+arr_a.length);
		for(int i=0;i<arr_a.length-size;i++) {
			arr_a[size+i]=scan.nextInt();
		}
		for(int i=0;i<arr_a.length;i++) {
			System.out.print(arr_a[i]+" ");
		}
		
		
	}

}
