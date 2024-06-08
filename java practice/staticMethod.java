import java.util.Scanner;

public class staticMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();

        if (isEven(num)) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }
    }
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
}
/*static method
remember static method should be written outside the main method
 */