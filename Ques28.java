import java.util.Scanner;

public class Ques28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int z = 1;
        for(int i=1; i<=n; i++){
            for(int j=n-1; j>=i; j--){
                System.out.print("\t");
            }
            for(int k=i-1; k>=-(i-1); k--){
                System.out.print(z-Math.abs(k)+"\t");
            }
            z+=2;
            System.out.println();
        }
    }
}
