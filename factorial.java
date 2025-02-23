import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial:");
        int num = scanner.nextInt();
        int result = 1;
        
        for(int i = 1; i <= num; i++) {
            result *= i;
        }
        
        System.out.println("The factorial of " + num + " is " + result);
    }
}
