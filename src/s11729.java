import java.io.IOException;
import java.util.Scanner;

public class s11729 {
    public static int k=0;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        hanoi(n,1,2,3);
        System.out.print(k+"\n");
        System.out.print(sb);
    }
    public static void hanoi(int n,int from,int by,int to){
        k++;
        if(n==1)
            sb.append(from+" "+to+"\n");
        else{
            hanoi(n-1,from,to,by);
            sb.append(from+" "+to+"\n");
            hanoi(n-1,by,from,to);
        }
    }
}

