package tech.fhaf.contas;

public class Conta {
    public int numero;
    public double saldo;

    public boolean sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }

    public boolean depositar(double valor) {
        if(valor >= 0) {
            this.saldo = this.saldo + valor;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return this.saldo;
    }
}
