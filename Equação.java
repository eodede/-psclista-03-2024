import java.util.Scanner;

public class Equação {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Da equação ax² + bx + c = 0");

        System.out.printf("Digite o valor de (a): ");
        int numA = scanner.nextInt();

        System.out.printf("Digite o valor de (b): ");
        int numB = scanner.nextInt();

        System.out.printf("Digite o valor de (c): ");
        int numC = scanner.nextInt();

        if (numA + numB == 0)(numC != 0){
            System.out.println("Coeficientes informados incorretamente.");
        }
    }
}
