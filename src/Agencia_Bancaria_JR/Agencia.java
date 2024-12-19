package Agencia_Bancaria_JR;

import java.util.*;

public class Agencia {
    private String id;
    private String nome;
    private Endereco end;
    private Banco banco;
    private List<Conta> contas;

    public Agencia(String id, String nome, Endereco end, Banco banco) {
        this.id = id;
        this.nome = nome;
        this.end = end;
        this.banco = banco;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public void exibirDetalhesAgencia(){
        System.out.println("Agência: "+nome+ "(ID: "+id+")");
        System.out.println("Endereço: "+end.toString());
        banco.exibir();
        System.out.println("Contas associadas:");
        for(Conta conta: contas){
            conta.exibirDetalhes();
        }
    }


}
