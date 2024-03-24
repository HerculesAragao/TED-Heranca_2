package tech.fhaf.contas;

public class ContaEspecial extends Conta {
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

    @Override
    void sacar(double quantidade) {
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
        //super.sacar(quantidade);
    }

    @Override
    void transferir(Conta destino, double valor) {
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
        //super.transferir(destino, valor);
    }

    @Override
    void atualizar(double taxa) {
        this.saldo += this.saldo * taxa*3;
        //super.atualizar(taxa);
    }
}
