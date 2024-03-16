import java.util.Scanner;

public class Maquina {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Preço:R$");
        int preço = scanner.nextInt();

        System.out.print("Valor pago:R$");
        int valorP = scanner.nextInt();

        int troco = (valorP - preço);

        if (valorP > preço){
            System.out.printf("Troco:R$%d", troco);
        }      
        if (valorP < preço) {
            System.out.printf("Saldo insuficiente!");
        }
        if (troco > 50) {
        int troco50 = troco - 50

        }
    
}
