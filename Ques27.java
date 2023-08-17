import java.util.Scanner;

public class Ques27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }

            for(int j=1; j<=(i*2-1)/2; j++){
                System.out.print(j+" ");
            }

            for(int j=(i*2)/2; j>=1; j--){
                System.out.print(j+" ");
            }
            
            System.out.println();
        }
    }
}
