import java.util.Scanner;

public class Ques9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("\t");
            }
            for(int j=1; j<2*i; j++){
                System.out.print("*\t");
                
            }

            System.out.println();
        }
    }
}
