package baekjoon;

import java.io.IOException;
import java.util.*;

public class s2108 {
    static int[] data;
    public static void main(String[] args) throws IOException {
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        data = new int[n];
        for(int i=0;i<n;i++){
            data[i]=in.nextInt();
        }
        Arrays.sort(data);
        StringBuilder sb = new StringBuilder();
        sb.append(avg()+"\n");
        sb.append(median()+"\n");
        sb.append(mode()+"\n");
        sb.append(range());
        System.out.println(sb);
    }
    public static int avg(){
        float sum=0;
        for(int i=0;i<data.length;i++){
            sum+=data[i];
        }
        return Math.round(sum/data.length);
    }
    public static int median(){
        int index=data.length/2;
        return data[index];
    }
    public static int mode(){
        int[] count = new int[8001];
        List<Integer> check = new ArrayList<>();
        for(int i=0;i<data.length;i++){
            count[data[i]+4000]++;
        }
        int mode=0;
        int cnt=0;
        for(int j=0;j<count.length;j++){
            if(count[j]>cnt){
                cnt=count[j];
            }
        }
        int maxCnt=0;
        for(int k=0;k<count.length;k++){
            if(count[k]==cnt && maxCnt==0){
                mode=k;
                maxCnt++;
            }
            else if(count[k]==cnt && maxCnt==1){
                mode=k;
                break;
            }
        }
        return mode-4000;
    }
    public static int range(){
        return Math.abs(data[0]-data[data.length-1]);
    }
}