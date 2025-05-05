package Self_Prep;

import java.util.Scanner;

public class Array_Oddindex_Evenindex {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=obj.nextInt();
		int a[]=new int[size];
		System.out.println("Enter the values of the array: ");
		for(int i=0;i<size;i++) a[i]=obj.nextInt();
		//for(int i=0;i<size;i++) System.out.print(a[i]+" ");
		//to print the odd and even index values in an array
		System.out.println("The odd index values are: ");
		for(int i=0;i<size;i++)if(i%2==1)System.out.print(a[i]+" ");
		System.out.println("\nThe even index values are: ");
		for(int i=0;i<size;i++)if(i%2==0)System.out.print(a[i]+" ");	
		//to print the odd and even values in an array
		System.out.println("\nThe odd values are: ");
		for(int i=0;i<size;i++)if(a[i]%2==1)System.out.print(a[i]+" ");
		System.out.println("\nThe even values are: ");
		for(int i=0;i<size;i++)if(a[i]%2==0)System.out.print(a[i]+" ");	
	}

}
