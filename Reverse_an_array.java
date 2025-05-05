package Array;

import java.util.Scanner;

class Reversing{
/*public void reverse(int arr[],int start,int end) {
	while(start<end) {
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
	for(int i=0;i<arr.length;i++) System.out.print(arr[i]+" ");	
	System.out.println();
}*/
}
public class Reverse_an_array {
	
	public static int[] reverseBySwapping(int[] arr,int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		return arr;
	}
	public static int[] reverseByForloop(int[] arr) {
		int result[]=new int[arr.length];
		int j=0;
		for(int i=result.length-1;i>=0;i--) {
			result[j]=arr[i];
			j++;
		}
		return result;
		
	}
	public static void printArray(int[] result) {
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Size: ");
		int size=scan.nextInt();
		int arr_a[]=new int[size];
		System.out.println("Enter the array values: ");
		for(int i=0;i<size;i++) arr_a[i]=scan.nextInt();
		//By Swapping Method
		//Reversing obj=new Reversing();
		//obj.reverse(arr_a,0,size-1);
		int b[]=arr_a.clone();
		//for(int i=size-1;i>=0;i--)System.out.print(arr_a[i]+" ");
		int[] result=reverseBySwapping(arr_a,0,arr_a.length-1);
		printArray(result);
		int[] loopResult=reverseByForloop(b);
		printArray(loopResult);
		scan.close();

	}
}
