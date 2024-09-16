import java.util.Scanner;
import conta.*;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        //Instânciar classe cliente
        Conta conta1 = new Conta(0, null, null, 0);
        
        //Receber Numero do Cliente  
        System.out.println("Insira o Numero do Cliente: ");
        int numero = input.nextInt();
        conta1.setNumeroCliente(numero);
        input.nextLine(); // Limpar o buffer do scanner
        
        //Receber Agencia do Cliente
        System.out.println("Insira a Agencia do Cliente: ");
        String agencia = input.next();
        conta1.setAgenciaCliente(agencia);
        input.nextLine(); // Limpar o buffer do scanner

        //Receber Nome do Cliente
        System.out.println("Insira o Nome do Cliente: ");
        String nome = input.next();
        conta1.setNomeCliente(nome);
        input.nextLine(); // Limpar o buffer do scanner
        
        //Receber Saldo do Cliente
        System.out.println("Insira o Saldo do Cliente: ");
        float saldo = input.nextFloat();
        conta1.setSaldoCliente(saldo);
        input.nextLine(); // Limpar o buffer do scanner
        
        
        System.out.println("Olá " + conta1.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta1.getAgenciaCliente() + ", conta " + conta1.getNumeroCliente() + " e seu saldo " + conta1.getSaldoCliente() + " já está disponível para saque.");
    
    input.close();
    
    }
}
