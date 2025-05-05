package Array;

import java.util.Scanner;

public class Array_palindrome_without_equals {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("String: ");
		String wordd=scan.nextLine();
		String word=wordd.toLowerCase();
		char arr[]=word.toCharArray();
		int j=arr.length-1;
		int b=0;
		for(int i=0;i<arr.length/2;i++)
		{
			if(arr[i]!=arr[j]) b++;
			j--;
		}
		System.out.println((b!=0)?"Not a palindrome":"Paindrome");

	}

}
