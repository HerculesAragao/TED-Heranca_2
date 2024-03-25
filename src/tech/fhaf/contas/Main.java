package tech.fhaf.contas;

/*package Conta.app;

import Conta.conta.Conta;
import Conta.conta.ContaEspecial;
import Conta.conta.ContaInvestimento;*/

import tech.fhaf.contas.Conta;
import tech.fhaf.contas.ContaEspecial;
import tech.fhaf.contas.ContaInvestimento;

public class Main {

    public static void main(String[] args) {
        Conta conta1 = new Conta();
        Conta conta2 = new Conta();

        ContaEspecial contaesp1 = new ContaEspecial();
        ContaInvestimento containvest1 = new ContaInvestimento();

        conta1.numero = 1;
//		conta1.saldo = 10000;
        conta1.depositar(10000);
        conta2.numero = 2;
        conta2.saldo = 20000;

        contaesp1.numero = 01;
        contaesp1.saldo = 120000;
        containvest1.numero = 02;
        containvest1.saldo = 150000;

        System.out.println("Número da conta 1: " + conta1.numero);
        System.out.println("Número da saldo 1: " + conta1.saldo);
        System.out.println("Número da conta 2: " + conta2.numero);
        System.out.println("Número da saldo 2: " + conta2.saldo);
        System.out.println("Conta Especial: " + contaesp1.limite);
        System.out.println("Conta Especial: " + contaesp1.numero);
        System.out.println("Conta Especial: " + contaesp1.saldo);
        System.out.println("Conta Investimento: " + containvest1.taxa);
        System.out.println("Conta Investimento: " + containvest1.prazo);
        System.out.println("Conta Investimento: " + containvest1.saldo);
    }
}