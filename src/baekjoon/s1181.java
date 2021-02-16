package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class s1181 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String[] arr = new String[n];
        ArrayList<String> result = new ArrayList<>();
        for(int i=0;i<n;i++){
            arr[i] = br.readLine();
        }
        Arrays.sort(arr, new Comparator<String>() { //정렬
            @Override
            public int compare(String o1, String o2) {
                if(o1.length()!=o2.length())
                    return o1.length()-o2.length();
                else
                    return o1.compareTo(o2);

            }
        });

        for(int i=0;i<n;i++){ //중복제거
            if(!result.contains(arr[i]))
                result.add(arr[i]);
        }

        for(int i=0;i<result.size();i++){
            sb.append(result.get(i)+"\n");
        }
        System.out.println(sb.toString());
    }
}
