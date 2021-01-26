import java.io.IOException;
import java.util.Scanner;

public class s10870 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        System.out.print(fibonacci(n));
    }
    public static int fibonacci(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
}
