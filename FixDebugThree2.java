import java.util.Scanner;

public class FixDebugThree2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a, b, c;
        System.out.print("Enter first integer: ");
        a = input.nextInt();
        
        System.out.print("Enter second integer: ");
        b = input.nextInt();
        
        c = a + b;

        System.out.println("The sum is " + c);
        
        input.close();
    }
}
