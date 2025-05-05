package Array;

import java.util.Scanner;

public class Array_String_Palindrome {
	public static void strmethod(char arr[],String word) {
		int b=0;
		int j=arr.length-1;
		for(int i=0;i<(arr.length-1)/2;i++) {
			if(arr[i]!=arr[j]) {
				b++;
			}
			j--;
		}
		System.out.println((b>0)? word+" is not a palindrome": word+ " is a palindrome");
	}

	public static void main(String args[]) 	{
		Scanner scan=new Scanner(System.in);
		System.out.println("String: ");
		String wordd=scan.nextLine();
		String word=wordd.toLowerCase();
		char arr[]=word.toCharArray();
//		String new_word="";
//		for(int i=arr.length-1;i>=0;i--) new_word=new_word+arr[i];
//		System.out.println((new_word.equals(word))?"Palindrome":"Not Palindrome");
//		scan.close();
		strmethod(arr, word);
	}
}
