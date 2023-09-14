import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o numero da sua conta:");
        int numero = scanner.nextInt();
        
        System.out.println("Digite a sua agência:");
        String agencia = scanner.next();

        System.out.println("Digite seu nome:");
        String nome = scanner.next();
        
        System.out.println("Informe seu saldo inicial:");
        double saldo = scanner.nextDouble();
        
        scanner.close();
        
                System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco! Sua agência é " + agencia + ", Conta:" + numero +" e o seu saldo " + saldo + " e já está disponível para saque");
                  
    }
}
