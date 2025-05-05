package Self_Prep;

import java.util.Scanner;

public class sum_of_positive_and_Negative_num_in_array {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=obj.nextInt();
		int arr[]=new int[size];
		System.out.print("Enter the values of the array: ");
		for(int i=0;i<size;i++) arr[i]=obj.nextInt();
		//for(int i=0;i<size;i++) System.out.print(arr[i]+" ");
		int sump=0;
		for(int i=0;i<size;i++) 
			{
				if(arr[i]>0)
				{
					sump+=arr[i];
				}
			}
		System.out.println("The sum of positive numbers are: "+sump);
		int sumn=0;
		for(int i=0;i<size;i++) 
			{
				if(arr[i]<0)
				{
					sumn+=arr[i];
				}
			}
		System.out.println("The sum of negative numbers are: "+sumn);
		

	}

}
