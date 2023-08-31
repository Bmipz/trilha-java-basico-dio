import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        //Instanciando a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Coletando os dados:
        //Nome do usuário;
        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.nextLine();

        //Número da agência;
        System.out.println("Digite número da Agência:");
        String numeroAgencia = scanner.next();

        //Número da conta;
        System.out.println("Digite número da conta:");
        int numeroConta = scanner.nextInt();

        //Saldo da conta;
        System.out.println("Digite saldo para saque:");
        double saldoParaSaque = scanner.nextDouble();

        //Exibindo todos os dados ao usuário;
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo " + saldoParaSaque + " já está disponivel para saque.");

    }
}
