package baekjoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class s3085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max=1; //사탕의 최대 개수

        int n = Integer.parseInt(br.readLine());
        char[][] board = new char[n][n]; //보드

        for(int i=0;i<n;i++){ //보드 입력
            board[i] = br.readLine().toCharArray();
        }
/*
        for(int i=0;i<n-1;i++){ //모든 행
            for(int j=0;j<n;j++){
                change(board,i,j,i+1,j);
                int count = count(board, i, j, i + 1, j);
                change(board,i+1,j,i,j);
                if(count>max) {
                    max = count;
                }
            }
        }
        for(int i=0;i<n;i++){ //모든 열
            for(int j=0;j<n-1;j++){
                change(board,i,j,i,j+1);
                int count = count(board, i, j, i,j + 1);
                change(board,i,j+1,i,j);
                if (count > max) {
                    max = count;
                }
            }
        }
        */
        for(int i=0;i<n-1;i++){ 
            for(int j=0;j<n;j++){
                if(i+1<n) { //행 바꿈
                    change(board, i, j, i + 1, j);
                    int count = count(board, i, j, i + 1, j);
                    change(board, i + 1, j, i, j);
                    if (count > max) {
                        max = count;
                    }
                }
                if(j+1<n){ //열 바꿈
                    change(board,i,j,i,j+1);
                    int count = count(board, i, j, i,j + 1);
                    change(board,i,j+1,i,j);
                    if (count > max) {
                        max = count;
                    }
                }
            }
        }
        System.out.println(max);
    }
    public static void change(char[][] board,int col1,int row1,int col2,int row2){
        char temp = board[col2][row2];
        board[col2][row2] = board[col1][row1];
        board[col1][row1] = temp;
    }
    public static int count(char[][] board,int i1,int j1,int i2,int j2){
        int max=1;

        for(int i=i1;i<=i2;i++){ // 행 검사
            int count=1;
            for(int j=1;j<board.length;j++){
                if(board[i][j] == board[i][j-1]){
                    count +=1;
                }
                else {

                    count = 1;
                }
                if(max<count)
                    max=count;
            }
        }
        for(int i=j1;i<=j2;i++){ // 열 검사
            int count=1;
            for(int j=1;j<board.length;j++){
                if(board[j][i] == board[j-1][i]){
                    count +=1;
                }
                else {
                    count = 1;
                }
                if(max<count)
                    max=count;
            }
        }
        return max;
    }
}
