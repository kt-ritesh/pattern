import java.util.Scanner;

public class Ques26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int val = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("\t");
            }
            for(int j=1; j<2*i; j++){
                System.out.print(val+"\t");
                val++;
                
            }

            val = 1;
            System.out.println();
        }
    }
}
