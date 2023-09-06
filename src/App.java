import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o numero da conta:");
        int numero = input.nextInt();

        System.out.println("Digite a agencia da conta:");
        String agencia = input.next();

        System.out.println("Digite o nome do cliente:");
        String nome_cliente = input.next();

        System.out.println("Digite o saldo da conta:");
        double saldo = input.nextDouble();

        ContaTerminal conta = new ContaTerminal(numero, agencia, nome_cliente, saldo);

        System.out.println("Olá, "
                + conta.nome_cliente
                + " obrigado por abrir uma conta no nosso banco sua agencia é "
                + conta.agencia + " e seu saldo é "
                + conta.saldo);

    }
}
