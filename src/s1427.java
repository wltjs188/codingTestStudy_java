import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class s1427 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.print(sort(n));
    }
    public static String sort(int n){
        String number = Integer.toString(n);
        char[] arr= new char[number.length()];
        for(int i=0;i<arr.length;i++){
            arr[i] = number.charAt(i);
        }
        Arrays.sort(arr);
        return new StringBuilder((new String(arr))).reverse().toString();
    }
}
