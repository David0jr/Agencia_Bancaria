package Agencia_Bancaria_JR;

//import java.util.ArrayList;
import java.util.*;

public class Banco {
    private String nomeBanco;
    private List<Endereco> enderecos;
    private String tipoBanco;
    private String cnpjBanco;


    public Banco(String nomeBanco, String tipoBanco, String cnpjBanco) {
        this.nomeBanco = nomeBanco;
        this.enderecos = new ArrayList<>();
        this.tipoBanco = tipoBanco;
        this.cnpjBanco = cnpjBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public String getTipoBanco() {
        return tipoBanco;
    }

    public void setTipoBanco(String tipoBanco) {
        this.tipoBanco = tipoBanco;
    }

    public String getCnpjBanco() {
        return cnpjBanco;
    }

    public void setCnpjBanco(String cnpjBanco) {
        this.cnpjBanco = cnpjBanco;
    }

    public void adicionarEndereco(Endereco endereco) {
        enderecos.add(endereco);
    }

    public void exibir() {
        System.out.println("Nome Banco: " + nomeBanco +
                "Tipo do Banco: " + tipoBanco +
                "CNPJ: " + cnpjBanco);
        for (Endereco endereco : enderecos) {
            System.out.println("Endereco Banco" + endereco.toString());
        }

    }
}
    /*@Override
    public String toString() {
        return "Banco{" + "nomeBanco=" + nomeBanco + ", tipoBanco=" + tipoBanco + ", cnpjBanco=" + cnpjBanco + '}';
    }*/