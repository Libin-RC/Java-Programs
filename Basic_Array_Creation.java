package Array;
import java.util.Scanner;

class Printing{
	Scanner objj=new Scanner(System.in);
	public void print_array(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public void receive_array(int size, int arr[]) {
		for(int i=0;i<size;i++) {
			arr[i]=objj.nextInt();
		}
	}
}
public class Basic_Array_Creation {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Size of the array: ");
		int size=obj.nextInt();
		int arr[]=new int[size];
		System.out.println("Array values: ");
		Printing obj1=new Printing();
		obj1.receive_array(size,arr);
		obj1.print_array(arr);	
	}
}
