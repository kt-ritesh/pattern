import java.util.Scanner;

public class Ques28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            int p = i;
            for(int j=1; j<=(i*2-1); j++){
                System.out.print(p+" ");
                if(j<i){
                    p++;
                }else{
                    p--;
                }
                
            }

            
            System.out.println();
        }
    }
}
