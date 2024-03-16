import java.util.Scanner;

public class Operação {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite o 1º número: ");
        int numeroU = scanner.nextInt();

        System.out.print("Digite o 2º número: ");
        int numeroD = scanner.nextInt();

        System.out.print("Digite um simbolo: (+) (-) (*) (/): ");
        char op = input.next().charAt(0);

        switch (op) {
            case '+':
                System.out.printf("A soma é: %d", numeroU + numeroD);
                break;
            case '-':
                System.out.printf("O resultado da subtração será: %d", numeroU - numeroD);
                break;
            case '*':
                System.out.printf("O resultado da multiplicação será: %d", numeroU * numeroD);
                break;
            case '/':
                System.out.printf("O resultado da divisão será: %d", numeroU / numeroD);
                break;
            default:
                System.out.printf("O símbolo da operação é invalido");
                break;

        }
        scanner.close();
        input.close();
    }
}
