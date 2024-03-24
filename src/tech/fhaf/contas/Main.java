package tech.fhaf.contas;

public class Main {
    public static void main(String[] args) {

        Conta c1 = new Conta();
        ContaEspecial c2 = new ContaEspecial();
        ContaInvestimento c3 = new ContaInvestimento();

        c1.sacar(500);
        c1.depositar(500);
        c1.transferir(100);
        c1.atualizar(0.3);

        c2.sacar(1000);
        c2.depositar(1000);
        c1.transferir(150);
        c2.atualizar(0.4);

        c3.sacar(1500);
        c3.depositar(1500);
        c1.transferir(200);
        c3.atualizar(0.5);

        System.out.println("Saldo Conta: " + c1.getSaldo());
        System.out.println("Saldo Conta Especial: " + c2.getSaldo());
        System.out.println("Saldo Conta Investimento: " + c3.getSaldo());
    }
}