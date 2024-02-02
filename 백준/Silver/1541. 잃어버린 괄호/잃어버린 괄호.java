import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main{
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int sum = Integer.MAX_VALUE;
        String[] substraction = br.readLine().split("-");
        
        for(int i=0; i<substraction.length; i++){
            int temp = 0;
            
            String[] addition = substraction[i].split("\\+");
            
            for(int j=0; j<addition.length; j++){
                temp += Integer.parseInt(addition[j]);
            }
            
            if(sum == Integer.MAX_VALUE){
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        System.out.println(sum);
    }
}