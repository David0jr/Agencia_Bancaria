package Agencia_Bancaria_JR;

public class Sistema_Bancario {

    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua XYZ", "Centro",
                "Lins", "SP", "16400-000", 1000);
        Endereco endereco2 = new Endereco("Rua ZYA", "Centro",
                "Promissão", "SP", "16600-000", 1002);
        Endereco enderecoAg = new Endereco("Rua HTA", "Las Palmas",
                "Cafelândia", "SP", "16500-000", 1003);

        Banco bnc_fatec = new Banco("Banco Fatec", "Físico",
                "12340001/12");
        Banco bnc_etec = new Banco("Banco Etec", "Digital",
                "42340001/19");

        bnc_fatec.adicionarEndereco(endereco);
        System.out.println("Informações do Banco Fatec");
        bnc_fatec.exibir();

        Cliente cli1 = new Cliente("C001", "João da Silva", "12345678901",
                endereco2);
        Cliente cli2 = new Cliente("C001", "Empresa ABC", "12345678901234",
                endereco2);

        Senha senha1 = new Senha("S001", "senha123");
        Senha senha2 = new Senha("S002", "senha456");
        String s1 = senha1.criptografia("senha123");

        System.out.println(s1);
        senha1.redefinirSenha("56789");
        System.out.println(senha1);


        ContaCorrente cc = new ContaCorrente("001", 1000.00, 500.00,
                "12345", cli1, senha1, 15.00);
        ContaPoupanca poup = new ContaPoupanca("002", 1000.00, 500.00,
                "54321", cli2, senha2);
        ContaSalario cs = new ContaSalario("003", 3000.00, 0.00, "67890",
                cli1, senha1);

        Credito cred1 = new Credito(1.8, "CART001",
                "123-4567-89-0", senha1, 321, 10000.00);

        Debito deb1 = new Debito("CART001",
                "123-4567-89-0", senha1, 321, 10000.00);

        cred1.exibirDadosCCredito();
        deb1.exibirCCDebito();

        System.out.println("Informações Agência");
        Agencia ag1 = new Agencia("A001", "Agência Central", enderecoAg, bnc_fatec);
        ag1.adicionarConta(cc);
        ag1.adicionarConta(cs);
        ag1.adicionarConta(poup);
        ag1.exibirDetalhesAgencia();

        cc.exibirDetalhes();
        poup.exibirDetalhes();
        cs.exibirDetalhes();

        System.out.println("Informações Transferência");
        Transferencia tf = new Transferencia("T001", "Transferencia entre contas",
                cc, poup, 300.00);
        tf.realizarTransferencia();
        tf.exibirDetalhes();

        System.out.println("Saldo atualizado da conta corrente: " + cc.getSaldo());
        System.out.println("Saldo atualizado da conta corrente: " + poup.getSaldo());

        System.out.println("Informações Investimento");
        Investimento inv1 = new Investimento("INV001", "Renda Fixa", 5000.00, 3000.00, 1000.00);
        Investimento inv2 = new Investimento("INV002", "CDB", 10000.00, 6000.00, 2000.00);
        System.out.println("Rendimento do investimento 1: " + inv1.calcularRendimento());
        inv1.exibirDetalhes();
        System.out.println("Rendimento do investimento 2: " + inv2.calcularRendimento());
        inv2.exibirDetalhes();
    }
}
