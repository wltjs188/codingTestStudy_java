package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class s1654 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K=Integer.parseInt(st.nextToken());
        int N=Integer.parseInt(st.nextToken());
        int[] line = new int[K];
        for(int i=0;i<K;i++){
            line[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(line);
        cutting(0,line[line.length-1],line,N);
    }
    public static void cutting(int low,int high,int[] arr,int N){
        int mid=0;
        while(high>=low) {
            mid=(low+high)/2;
            int count=0;
            for (int i = 0; i < arr.length; i++) {
                count += arr[i] / mid;
            }
            if (count >= N) {
                low=mid+1;
            }
            else if (count < N)
                high = mid-1;
        }
        System.out.println(high);
    }
}
