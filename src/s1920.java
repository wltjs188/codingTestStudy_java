import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class s1920 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] A = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            A[i]=Integer.parseInt(st.nextToken());
        }
        int m = Integer.parseInt(br.readLine());
        int[] B = new int[m];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<m;i++){
            B[i]=Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        for(int i=0;i<B.length;i++){
            sb.append(BinarySearch(0,A.length-1,A,B[i])+"\n");
        }
        System.out.print(sb);
    }
    public static int BinarySearch(int s,int e,int[] arr,int search){
        while(e - s >= 0) {
            int mid = (s+e)/2;
            if (arr[mid] == search)
                return 1;
            else if (arr[mid] < search)
                s=mid + 1;
            else if (arr[mid] > search)
                e=mid - 1;
        }
        return 0;
    }
}
