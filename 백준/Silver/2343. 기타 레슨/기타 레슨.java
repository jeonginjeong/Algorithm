import java.util.Scanner;

public class Main {
    
    public static int[] A;
    public static int sum;
    public static int cnt;
    public static int N;
    
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int [] A = new int[N];
    
    int low = 0;
    int high = 0;
    
    for(int i = 0; i<N; i++){
        A[i] = sc.nextInt();
        if(low < A[i]) low = A[i];
        high += A[i];
    }
    
    while(low <= high){
        int cnt = 0; //블루레이 갯수
        int mid = (low+high)/2; //블루레이 크기
        int sum = 0;
        
        for(int i = 0; i<N; i++){
            if(sum + A[i] > mid){
                cnt++;
                sum = 0;
            }
          sum += A[i];
        }
        
        if(sum != 0) cnt++;
        if(cnt > M){
             low = mid+1;
        } else {
            high = mid -1;
        }
    }
        System.out.println(low);
    }    
}