import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class s10816 {
    public static void main(String[] args ) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] card = new int[N];
        String[] str = br.readLine().split(" ");
        card=Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        int M = Integer.parseInt(br.readLine());
        int[] check = new int[M];
        HashMap<Integer,Integer> cardHM = new HashMap<>();
        str = br.readLine().split(" ");
        check = Arrays.stream(str).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(card);
        count(card,cardHM);
        for(int i=0;i<M;i++){
            if(binarySearch(0,card.length-1,card,check[i]))
                sb.append(cardHM.get(check[i])+" ");
            else
                sb.append(0+" ");
        }
        System.out.print(sb);
    }
    public static void count(int[] arr,HashMap<Integer,Integer> hm){
        int count=1;
        for(int i=0;i<arr.length;i++){
            if(i==arr.length-1)
                hm.put(arr[i],count);
            else if(arr[i]==arr[i+1])
                count++;
            else if(arr[i]!=arr[i+1]){
                hm.put(arr[i],count);
                count=1;
            }
        }
    }
    public static boolean binarySearch(int start,int end,int[] arr, int search){
        while(end-start>=0){
            int mid=(start+end)/2;
            if(arr[mid]==search)
                return true;
            else if(arr[mid]>search)
                end=mid-1;
            else if(arr[mid]<search)
                start=mid+1;
        }
        return false;
    }
}
