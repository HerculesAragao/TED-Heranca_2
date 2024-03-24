package tech.fhaf.contas;

public class Conta {
    protected double numero;
    protected double saldo;

    public double getSaldo() {
        return saldo;
    }
    void depositar(double quantidade) {
        this.saldo += quantidade;
    }
    void sacar(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
    void transferir(Conta destino, double valor) {
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }
    void atualizar(double taxa){
        this.saldo += this.saldo * taxa;
    }
}
