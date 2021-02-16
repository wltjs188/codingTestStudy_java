package baekjoon;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class s1037 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println(array[0]*array[n-1]);
    }
}
