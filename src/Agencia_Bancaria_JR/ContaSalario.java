package Agencia_Bancaria_JR;

public class ContaSalario extends Conta{

    public ContaSalario(String id, double saldo, double limite,
                        String numero, Cliente cliente, Senha senha) {
        super(id, saldo, limite, numero, cliente, senha);
    }
    @Override
    public void exibirDetalhes(){
        System.out.println("Conta Salário: {" + "id=" + id +
                ", saldo=" + saldo +
                ", limite=" + limite
                + ", numero=" + numero
                +'}');
    }
}