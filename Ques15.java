import java.util.Scanner;

public class Ques15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=(i-1)*2; j++){
                System.out.print("  ");
            }
            for(int k=i; k<=n; k++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=(i-1)*2; j++){
                System.out.print("  ");
            }
            for(int k=i; k<=n; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
