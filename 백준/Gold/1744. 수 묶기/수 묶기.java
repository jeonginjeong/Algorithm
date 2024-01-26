import java.io.*;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        
        int minusCnt = 0;
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i]<=0) minusCnt++;
        }
        Arrays.sort(arr);
    
        int ans = 0;
        for(int i=1; i<minusCnt;i+=2){
            ans  += (arr[i-1] * arr[i]);
        }
        
        if(minusCnt % 2 ==1) ans +=  arr[minusCnt - 1];
        
        if((n-minusCnt)%2==1) ans += arr[minusCnt];
        
        for(int i=n-1; i> minusCnt; i -=2){
            int mul = arr[i] * arr[i-1];
            int sum = arr[i] + arr[i-1];
            if(mul>sum){
                ans += mul;
            } else {
                ans += sum;
            }             
        }
        
        bw.write(String.valueOf(ans));
        bw.close();
        br.close();
    }   
    
}