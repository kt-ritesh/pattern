import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("\t");
            }
            for(int k=1; k<=i; k++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
