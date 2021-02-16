package baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class s2750 {
    static int[] data;
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        data = new int[n];
        for(int i = 0; i<n;i++){
            data[i]=in.nextInt();
        }
        selectionSort(n);
        for(int j=0;j<n;j++) {
            System.out.println(data[j]);
        }
    }
    public static void selectionSort(int n){
        int maxIndex=0;
        int tmp;
        if(n>=2) {
            for (int i = 0; i < n; i++) {
                if (data[maxIndex] < data[i]) {
                    maxIndex = i;
                }
            }
            tmp = data[n - 1];
            data[n - 1] = data[maxIndex];
            data[maxIndex] = tmp;
            selectionSort(n - 1);
        }
        else return;
    }
}
