package Array;
import java.util.Scanner;

public class Remove_even_integers_in_array {
	public static int[] removeEvenIntegers(int arr[]) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				count++;
			}
		}
		int result[]=new int[count];
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				result[j]=arr[i];
				j++;
			}
		}
		return result;
	}
	public static void printarray(int[] result) {
		for(int i=0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
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
		/*for(int i=0;i<size;i++) {
			System.out.print((arr_a[i]%2==1)? arr_a[i]+" ":"");
		}*/
		
		
		
		int result[]=removeEvenIntegers(arr_a);
		printarray(result);
		scan.close();
	}

}
