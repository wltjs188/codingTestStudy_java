import java.io.IOException;
import java.util.Scanner;

public class s2447 {
    static char[][] arr;

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

    }
    public static void star(int x,int y,int n,boolean blank){
        if(blank){
            for(int i=x;i<x+n;i++){
                for(int j=y;j<y+n;j++){
                    arr[i][j]=' ';
                }
            }
        }
        if(n==1){
            arr[x][y]='*';
        }


    }
}
