package tech.fhaf.contas;

public class ContaInvestimento extends Conta{
    public double taxa = 0.02;
    public int prazo;
    public boolean sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo = this.saldo - (valor * this.taxa);
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        if(valor >= 0) {
            this.saldo = this.saldo + (valor * this.taxa);
            return true;
        } else {
            return false;
        }
    }

    public void aplicarRendimento(double taxa) {
        this.saldo = this.saldo + (1 * taxa);
    }
}