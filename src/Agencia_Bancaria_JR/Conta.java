package Agencia_Bancaria_JR;

import java.util.*;

public abstract class Conta {
    protected String id;
    protected double saldo;
    protected double limite;
    protected String numero;
    protected Cliente cliente;
    protected Senha senha;

    public Conta(String id, double saldo, double limite,
                 String numero, Cliente cliente, Senha senha) {
        this.id = id;
        this.saldo = saldo;
        this.limite = limite;
        this.numero = numero;
        this.cliente = cliente;
        this.senha = senha;
    }

    public String getId() {
        return id;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getLimite() {
        return limite;
    }

    public String getNumero() {
        return numero;
    }

    public void depositar(double valor){
        saldo+=valor;
    }

    public void sacar(double valor){
        if(saldo + limite >= valor){
            saldo-=valor;
        }else{
            System.out.println("Saldo insuficiente");
        }
    }

    public abstract void exibirDetalhes();

}