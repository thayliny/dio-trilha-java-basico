import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


        System.out.println("Por favor, digite o  seu nome! ");
        String nomeConta = scanner.next();

        System.out.println("Por favor, digite o número da Agência!");
        String agenciaConta = scanner.next();

        System.out.println("Por favor, digite o número da Conta!");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o  Saldo da Conta!");
        double saldoConta = scanner.nextDouble();


        System.err.println("Olá "+ nomeConta +"  obrigado por criar uma conta em nosso banco, sua agência é  " + agenciaConta + ", conta  " + numeroConta + " e seu saldo "+ saldoConta +"  á está disponível para saque.");








    }

}
