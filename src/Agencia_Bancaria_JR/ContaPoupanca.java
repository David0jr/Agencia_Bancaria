package Agencia_Bancaria_JR;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String id, double saldo, double limite,
                         String numero, Cliente cliente, Senha senha) {
        super(id, saldo, limite, numero, cliente, senha);
    }

    public void exibirDetalhes(){
        System.out.println("Conta poupança: {" + "id=" + id +
                ", saldo=" + saldo +
                ", limite=" + limite
                + ", numero=" + numero
                +'}');
    }

}