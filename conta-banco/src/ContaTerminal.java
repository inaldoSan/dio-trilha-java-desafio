import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int numero;
        String agencia = "";
        String nomeCliente = "";
        double saldo;

        System.out.println("Qual o seu nome completo? ");
        nomeCliente = input.nextLine();
        System.out.println("Digite sua número da conta: ");
        numero = input.nextInt();

        System.out.println("Digite o número da agência: ");
        agencia = input.nextLine();
        System.out.println("Digite o saldo: ");
        saldo = input.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência: " + agencia + ", conta: " + numero + " e seu saldo: R$ " + saldo + " já está disponível para saque.");
    }
}
