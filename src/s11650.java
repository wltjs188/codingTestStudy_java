import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class s11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];
        for(int i=0;i<n;i++) {
            String[] str = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(str[0]);
            arr[i][1] = Integer.parseInt(str[1]);
        }
        Arrays.sort(arr,new Comparator<int[]>() { //Comparator 인터페이스 재정의
            public int compare(int[] o1, int[] o2) {
                if(o1[0]==o2[0])// x좌표의 값이 같다면 y좌표를 기준으로 정렬
                    return Integer.compare(o1[1], o2[1]);
                return Integer.compare(o1[0], o2[0]); // 나머지는 x좌표를 기준으로 정렬
            }
        });
        for(int i=0;i<n;i++) {
            sb.append(arr[i][0]+" "+arr[i][1]+"\n");
        }
        System.out.print(sb);
    }
}
