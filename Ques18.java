import java.util.Scanner;

public class Ques18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=n; i>=-n; i--){
            for(int j=1; j<=Math.abs(i); j++){
                System.out.print(" ");
            }
            for(int k=n; k>=Math.abs(i); k--){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
