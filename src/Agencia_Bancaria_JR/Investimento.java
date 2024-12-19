package Agencia_Bancaria_JR;

public class Investimento {
    private String id;
    private String tipoInvestimento;
    private double saldoAtual;
    private double saldoLiquido;
    private double valorInvestimento;

    public Investimento(String id, String tipoInvestimento, double saldoAtual, double saldoLiquido, double valorInvestimento) {
        this.id = id;
        this.tipoInvestimento = tipoInvestimento;
        this.saldoAtual = saldoAtual;
        this.saldoLiquido = saldoLiquido;
        this.valorInvestimento = valorInvestimento;
    }

    public double calcularRendimento(){
        double rendimento = 0;
        switch(tipoInvestimento.toLowerCase()){
            case "renda fixa":
                rendimento = valorInvestimento *0.05;
                break;
            case "renda variável":
                rendimento = valorInvestimento *0.1;
                break;
            case "cdb":
                rendimento = valorInvestimento *0.07;
                break;
            default:
                System.out.println("Tipo de Investimento desconhecido");
        }
        saldoLiquido+= rendimento;
        return rendimento;
    }
    public void exibirDetalhes(){
        System.out.println("Investimento ID:"+id+
                ", valor investimento: "+valorInvestimento+
                ", tipo: "+tipoInvestimento+", Saldo Atual: "+
                saldoAtual+
                ", Saldo Líquido: "+saldoLiquido);
    }

}
