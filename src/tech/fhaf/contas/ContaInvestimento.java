package tech.fhaf.contas;

public class ContaInvestimento extends Conta {
    @Override
    public double getSaldo() {
        return this.saldo;
        //return super.getSaldo();
    }

    @Override
    void depositar(double quantidade) {
        this.saldo += quantidade;
        //super.depositar(quantidade);
    }
    void sacar(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
    void transferir(Conta destino, double valor) {
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }
    void atualizar(double taxa) {
        this.saldo += this.saldo * taxa*2;
    }
}
