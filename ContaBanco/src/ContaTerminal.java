import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o número da sua conta?");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Quala a agência?");
        String agencia = scanner.nextLine();

        System.out.println("Qual seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Seu saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá" +nome+ ", obrigado por criar uma contaem nosso banco, sua agência é" +agencia+ ", conta" +numeroConta+" e seu saldo é: "+saldo);

        scanner.close();
    
    }

}
