package Agencia_Bancaria_JR;

import java.util.*;

public class Cliente {
    private String id;
    private String nome;
    private String cpfCnpj;
    private Endereco end;

    public Cliente(String id, String nome, String cpfCnpj, Endereco end) {
        this.id = id;
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.end = end;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }

    public String tipoCliente(){
        if(cpfCnpj.length()==11){
            return "Pessoa Física (CPF)" ;
        }else if(cpfCnpj.length()==14){
            return "Pessoa Jurídica (CNPJ)" ;
        }else{
            return "Documento inválido";
        }
    }

    public void exibirDetalhesClientes(){
        System.out.println("Cliente: "+nome+" (ID: "+id+")");
        System.out.println("Documento: "+cpfCnpj+" - "+tipoCliente());
        System.out.println("Endereço: "+end.toString());
    }
}