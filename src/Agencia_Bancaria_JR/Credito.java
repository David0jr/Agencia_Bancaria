package Agencia_Bancaria_JR;

public class Credito extends Cartao{
    private double juros;

    public Credito(double juros, String idCartao, String numero, Senha senha, int cvc, double limite) {
        super(idCartao, numero, senha, cvc, limite);
        this.juros = juros;
    }


    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    public void exibirDadosCCredito(){
        super.exibirDetalhesCartao();
        System.out.println("Juros: "+juros);
    }



}
