package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class s4375 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        while(sc.hasNextInt()){
            int n = sc.nextInt();
            int num = 0;
            for(int i=1;;i++){
                num = num * 10 + 1;
                num %= n;
                if(num == 0){
                    sb.append(i+"\n");
                    break;
                }
            }
        }
        System.out.println(sb);
    }
}
