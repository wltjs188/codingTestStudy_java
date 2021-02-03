import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class s2751 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] arr = new Integer[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            sb.append(arr[i]+"\n");
        }
        System.out.print(sb.toString());
    }
}