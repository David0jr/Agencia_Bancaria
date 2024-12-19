package Agencia_Bancaria_JR;

public class Debito extends Cartao {

    public Debito(String idCartao, String numero, Senha senha, int cvc, double limite) {
        super(idCartao, numero, senha, cvc, limite);
    }

    public double limiteSaqueDiario(){
        return 1000.0;
    }

    /*public double limiteConta(){
        return 5000.0;
    }*/

    public void exibirCCDebito(){
        super.exibirDetalhesCartao();
        System.out.println("Limite de saque diário:"
                + "R$ "+limiteSaqueDiario());
    }
}
