import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class s10989 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb =new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[10001];

        for(int i=0;i<n;i++){
            arr[Integer.parseInt(br.readLine())]++;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                for(int j=0;j<arr[i];j++){
                    sb.append(i+"\n");
                }
            }
        }
        System.out.print(sb.toString());
    }
}
