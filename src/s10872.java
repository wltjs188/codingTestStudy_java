import java.io.IOException;
import java.util.Scanner;

public class s10872 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.print(factorial(num));
    }
    public static int factorial(int n){
        if(n<=1)
            return 1;
        else
            return n*factorial(n-1);
    }
}
