package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class s17427 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Long result = 0L;
        for(int i=1;i<=n;i++){
            result += (n/i)*i;
        }
        System.out.println(result);
    }
}
