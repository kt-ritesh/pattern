import java.util.Scanner;

public class Ques22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n; j>=i; j--){
                System.out.print("* ");
            }
            for(int j=1; j<=i*2-3; j++){
                System.out.print("  ");
            }

            for(int j=i; j<=n; j++){
                if(j==1 && i==1) continue;
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
