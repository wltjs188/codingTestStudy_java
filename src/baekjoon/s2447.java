package baekjoon;

import java.io.IOException;
import java.util.Scanner;
public class s2447 {
    static char[][] arr;
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        arr = new char[n][n];
        star(0,0,n,false);
        StringBuilder sb  = new StringBuilder();
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n;j++){
                sb.append(arr[i][j]);
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
    public static void star(int x,int y,int n,boolean blank){
        if(blank){ //공백
            for(int i=x;i<x+n;i++){
                for(int j=y;j<y+n;j++){
                    arr[i][j]=' ';
                }
            }
            return;
        }
        if(n==1){ //블록크기가 1일때
            arr[x][y]='*';
            return;
        }
        int size = n/3; //블록의 크기
        int count = 0;
        for(int i = x; i < x + n; i+=size){
            for(int j = y; j < y + n; j+=size){
                count++;
                if(count==5) //가운데 공백칸
                    star(i,j,size,true);
                else
                    star(i,j,size,false);
            }
        }
    }
}
