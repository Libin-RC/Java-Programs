package Self_Prep;

import java.util.Scanner;

public class Second_Largest_num_in_array {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int size=obj.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the values of the array: ");
		for(int i=0;i<size;i++)
		{
			arr[i]=obj.nextInt();
		}
		
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<size;i++)
		{
			if(arr[i]>largest) 
			{
				largest=arr[i];
			}
		}
		//System.out.println(largest);
		
		int s_largest=Integer.MIN_VALUE;
		for(int i=0;i<size;i++)
		{
			if(arr[i]>s_largest && arr[i]!=largest) 
			{
				s_largest=arr[i];
			}
		}
		System.out.println("Second Largest Value: "+s_largest);
		
		int t_largest=Integer.MIN_VALUE;
		for(int i=0;i<size;i++)
		{
			if(arr[i]>t_largest && arr[i]!=largest && arr[i]!=s_largest) 
			{
				t_largest=arr[i];
			}
		}
		//System.out.println(t_largest);
	}

}
