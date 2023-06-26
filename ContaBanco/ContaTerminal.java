package ContaBanco;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        int numero;
        String agencia, nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número de sua Conta!");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o sua Agência!");
        agencia = scanner.next();

        System.out.println("Por favor, digite o seu nome!");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo!");
        saldo = scanner.nextLong();

        System.out.print("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
        scanner.close();
    }

}
