import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
        double n;
        Scanner inp = new Scanner(System.in);
        System.out.println("Sayi giriniz :");
        n = inp.nextInt();
        double sum = 0;

        for (double i = 1; i <= n;i++) {
            sum += 1 / i;
            System.out.println(sum);
        }

    }
}
