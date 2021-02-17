package baekjoon;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class s1688 { //골드바흐의 추측
    static final int max = 1000000;
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        boolean[] check = new boolean[max+1];//true-소수아님/지움,false-소수/안지움
        ArrayList<Integer> prime = new ArrayList<>(); //소수배열
        check[0] = check[1] = true; //0과1은 소수 아님

        for(int i=2;i<=max;i++){
            if(check[i]==true){ //지워졌으면
                continue;
            }
            prime.add(i); //지워지지않은것중 가장 작은수
            for(int j=i+i;j<=max;j+=i){ //의 배수를 지움
                check[j]=true;
            }
        }

        while(true){
            int n =sc.nextInt();
            if(n == 0){
                break;
            }
            for(int i=0;i<prime.size();i++){
                int p = prime.get(i);
                if(check[n-p]==false){ //골드바흐의 추측
                    sb.append(n + " = " + p + " + " + (n-p)+"\n" );
                    break;
                }
                if(i==prime.size()-1)
                    sb.append("Goldbach's conjecture is wrong.\n");
            }
        }
        System.out.print(sb);
    }
}
