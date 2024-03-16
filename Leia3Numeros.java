import java.util.Scanner;

public class Leia3Numeros {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o 1º número:");
    double numero1 = scanner.nextDouble();

    System.out.println("\nDigite o 2º número:");
    double numero2 = scanner.nextDouble();

    System.out.println("\nDigite o 3º número:");
    double numero3 = scanner.nextDouble();

    double maior = Math.max(numero1, Math.max(numero2, numero3));

    double menor = Math.min(numero1, Math.min(numero2, numero3));

    double media = (numero1 + numero2 + numero3) / 3;

    System.out.println("\nO maior número é: " + maior);
    System.out.println("O menor número é: " + menor);
    System.out.println("A média aritmética dos três números é: " + media);

    scanner.close();
    }

}