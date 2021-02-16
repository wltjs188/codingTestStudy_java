package baekjoon;
import java.io.*;
public class s17425 {
    static final int test = 1000000; //모든 testcase의 결과값을 미리 구해둠
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        Long[] d = new Long[test+1];//f(A): 자연수 A의 약수의 합
        Long[] s = new Long[test+1];//g(x): x이하의 모든 자연수Y의 f(Y) 값을 더한 값

        for(int i=1;i<=test;i++){ //모든 수는 1을 약수로 가지고 있음
            d[i] = 1L;
        }

        for(int i=2;i<=test;i++){ //f(A): i의 배수는 i를 약수로 갖고 있음.
            for(int j=1;i*j<=test;j++){
                d[i*j] +=i;
            }
        }
        s[0]=0L;
        for(int i=1;i<=test;i++){ //g(x)
            s[i] = s[i-1] + d[i];
        }

        for(int i=0;i<n;i++){
            sb.append(s[Integer.parseInt(br.readLine())]+"\n");
        }
        System.out.print(sb);
    }
}
