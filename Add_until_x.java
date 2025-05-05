package Basics;
import java.util.Scanner;

public class Add_until_x {

	public static boolean isNumber(String input) {
		for(int i=0;i<input.length();i++) {
			char ch=input.charAt(i);
			if(ch<'0'|| ch>'9') {
				return false;
			}
		}
		return true;
	}
	
	public static int strToNum(String input) {
		int result=0;
		for(int i=0;i<input.length();i++) {
			result= result*10+(input.charAt(i)-'0');
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int sum=0;
		while(true) {
			System.out.println("Enter the number: ");
			String input=obj.next();
			if(input.length()==1 && input.charAt(0)=='x' || input.charAt(0)=='X') break;
			else if(isNumber(input)) {
				int num=strToNum(input);
				sum=sum+num;
			}
		}
		System.out.println("Addition: "+sum);
	}

}
