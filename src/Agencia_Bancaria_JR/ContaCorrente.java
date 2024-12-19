package Agencia_Bancaria_JR;

public class ContaCorrente extends Conta{
    private double tarifa;

    public ContaCorrente(String id, double saldo, double limite,
                         String numero, Cliente cliente, Senha senha, double tarifa) {
        super(id, saldo, limite, numero, cliente, senha);
        this.tarifa = tarifa;
    }


    public double getTarifa() {
        return tarifa;
    }

    public void setTarifa(double tarifa) {
        this.tarifa = tarifa;
    }

    @Override
    public void exibirDetalhes(){
        System.out.println("Conta{" + "id=" + id +
                ", saldo=" + saldo +
                ", limite=" + limite
                + ", numero=" + numero
                + ", tarifa="+tarifa+'}');
    }

    public void exibirTipoConta(){
        System.out.println("Conta Corrente: "+ tarifa);
    }



}