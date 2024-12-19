package Agencia_Bancaria_JR;

public class Transferencia {
    private String id;
    private String descricao;
    private Conta remetente;
    private Conta destinatario;
    private double valor;

    public Transferencia(String id, String descricao, Conta remetente, Conta destinatario, double valor) {
        this.id = id;
        this.descricao = descricao;
        this.remetente = remetente;
        this.destinatario = destinatario;
        this.valor = valor;
    }

    public void realizarTransferencia(){
        if (remetente.getSaldo() >= valor){
            remetente.sacar(valor);
            destinatario.depositar(valor);
            System.out.println("Transferência realizada com sucesso: "+
                    descricao);
        }else{
            System.out.println("Saldo insuficiente para transferência");
        }
    }

    public void exibirDetalhes(){
        System.out.println("Transferencia ID:"+id+
                ", valor: "+valor+", Remetente: "+remetente.numero+
                ", Destinatário: "+destinatario.numero);
    }


}
