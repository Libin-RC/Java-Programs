package Self_Prep;
import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = obj.nextInt();
		int i = 2, count = 0;

		while (i <=num/2) {
			if (num % i == 0) {
				count++;
				break;
			}
			i++;
		}

		if (num < 2) {
			System.out.println(num + " is neither a composite nor a prime");
		} else if (count == 0) {
			System.out.println(num + " is a Prime Number");
		} else {
			System.out.println(num + " is a Composite Number");
		}
		obj.close();
	}
}
