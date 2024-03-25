package tech.fhaf.contas;

public class ContaEspecial extends Conta{
    public double limite;
    public boolean sacar(double valor) {
        if(this.getSaldo() >= valor) {
            this.saldo = this.saldo - (valor * 0.99);
            return true;
        } else {
            return false;
        }
    }
}