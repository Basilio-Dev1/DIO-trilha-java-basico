import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var ler= new Scanner(System.in);


        System.out.println("Bem vindo a agencia! vamos realizar seu cadastro");

        System.out.println("Digite o seu nome!");
        String cliente = ler.nextLine();
        System.out.println("Bem vindo! O seu numero de usuario é "+cliente);
        System.out.println("Qual o seu numero de usuario?");
        int user = ler.nextInt();
        ler.nextLine(); // tive que inserir para limpar, se não ele leria automaticamente a proxima linha
        System.out.println("Perfeito, qual o numero da sua agencia? ");
        String agency = ler.nextLine();
        System.out.println("Consegui localizar, Deseja inserir seu saldo?");
        Float balance = ler.nextFloat();

        System.out.println("\"Olá"+ user+ ", obrigado por criar uma conta em nosso banco, sua agência é"+ (agency) + ", conta"+(user)+ " e seu saldo"+(balance)+ "já está disponível para saque.");

    }
}

