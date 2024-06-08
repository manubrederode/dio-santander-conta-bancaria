
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        
        //Scanner object
        Scanner scanner = new Scanner(System.in);

        //Attributes and Inputs
        System.out.println("Por favor, digite o número da conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = scanner.next();

        try {
            System.out.println("Por favor, digite o saldo: ");
            double saldo = scanner.nextDouble();
        } catch (InputMismatchException e){
            System.out.println("O valor do saldo precisa ser numérico.");
        }

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
