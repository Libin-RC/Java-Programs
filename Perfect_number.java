package Self_Prep;

import java.util.Scanner;

public class Perfect_number {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = obj.nextInt();

        if (num <= 0) {
            System.out.println("Perfect numbers are positive integers greater than 0.");
        } else {
            int sum = 0;
            for (int i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                }
            }
            System.out.println((sum == num) ? num + " is a perfect number" : num + " is not a perfect number");
        }
    }
}
