import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {

        Scanner Scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println(" Por favor, digite o número da Conta ");
        int contaCliente = Scanner.nextInt();

        System.out.println("Por favor, digite o número da Agência ");
        String agenciaCliente = Scanner.next();

        System.out.println("Por favor, digite o seu primeiro nome: ");
        String primeiroNomeCliente = Scanner.next();

        System.out.println("Por favor, digite o seu sobrenome: ");
        String sobrenomeCliente = Scanner.next();;

	    double saldoCliente = 237.48;
        

	    System.out.println("Olá " + primeiroNomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agenciaCliente + " conta " + contaCliente + " e seu saldo é R$ " + saldoCliente + " já está disponível para saque.");

    }
}
