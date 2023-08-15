import java.util.Scanner;

public class Ques27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=n-1; j>=i; j--){
                System.out.print("\t");
            }
            for(int k=i-1; k>=-(i-1); k--){
                System.out.print(i-Math.abs(k)+"\t");
            }
            System.out.println();
        }
    }
}
