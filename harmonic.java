import java.util.Scanner;

public class harmonic {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Harmonik serisi bulunacak sayıyı giriniz: ");
        int number = scan.nextInt();
        double total = 0.0;
        for (double i = 1; i <= number ; i++){
            total += (1/i);
        }
        System.out.print(total);
    }
}
