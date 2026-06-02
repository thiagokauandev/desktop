package Imobiliaria;

public class AppImobiliaria {

    public static void main(String[] args) {

        // Criando o proprietário
        Pessoa proprietario = new Pessoa("Carlos Silva", "carlos@email.com", 51999990000L);

        // Criando imóvel de aluguel
        ImovelAluguel imovelAluguel = new ImovelAluguel(
            proprietario, 80.0f, "Apartamento",
            "Rua das Flores", 123, "Apto 201",
            "Centro", "Bagé", "RS",
            "Residencial", 2400.0f, 1200.0f
        );

        // Criando imóvel de venda
        ImovelVenda imovelVenda = new ImovelVenda(
            proprietario, 120.0f, "Casa",
            "Av. Brasil", 500, "",
            "Jardim América", "Bagé", "RS",
            350000.0f, 15000.0f, 120.0f
        );

        float fatorIPTU = 10.0f;

        // IPTU
        System.out.println("========== IPTU ==========");
        System.out.printf("IPTU do Imóvel Aluguel : R$ %.2f%n",
                imovelAluguel.calcularIPTU(fatorIPTU));
        System.out.printf("IPTU do Imóvel Venda   : R$ %.2f%n",
                imovelVenda.calcularIPTU(fatorIPTU));

        // FINANCIAMENTO
        float valorVenda     = imovelVenda.getValorVenda();   // 350.000
        int   prazoMeses     = (int) imovelVenda.getPrazoFinanciamento(); // 120 meses
        float taxaMensal     = 0.01f;                         // 1% ao mês

        float valorFinanciado = Financeiro.calcularFinanciamento(valorVenda, prazoMeses, taxaMensal);

        System.out.println("\n========== FINANCIAMENTO ==========");
        System.out.printf("Valor original do imóvel : R$ %.2f%n", valorVenda);
        System.out.printf("Valor financiado (%d meses, %.0f%% a.m.) : R$ %.2f%n",
                prazoMeses, taxaMensal * 100, valorFinanciado);

        //VENDA À VISTA COM DESCONTO
        float percentualDesconto = 0.05f;  // 5%
        float valorDesconto      = Financeiro.calcularDesconto(valorVenda, percentualDesconto);
        float valorAVista        = valorVenda - valorDesconto;

        System.out.println("\n========== VENDA À VISTA ==========");
        System.out.printf("Valor original: R$ %.2f%n", valorVenda);
        System.out.printf("Desconto (%.0f%%): R$ %.2f%n",
                percentualDesconto * 100, valorDesconto);
        System.out.printf("Valor à vista: R$ %.2f%n", valorAVista);

        // ITBI 
        float taxaITBI  = 0.02f;  // 2%
        float valorITBI = imovelVenda.calcularITBI(taxaITBI);

        System.out.println("\n========== ITBI ==========");
        System.out.printf("ITBI (%.0f%% sobre R$ %.2f) : R$ %.2f%n",
                taxaITBI * 100, valorVenda, valorITBI);

        // ALUGUEL E ACRÉSCIMO POR ATRASO 
        float valorAluguel   = imovelAluguel.getValorAluguel(); // 1.200
        float taxaAtraso     = 0.02f;  // 2% de multa/juros por atraso
        float valorAcrescimo = Financeiro.calcularAcrescimo(valorAluguel, taxaAtraso);

        System.out.println("\n========== ALUGUEL ==========");
        System.out.printf("Valor do aluguel        : R$ %.2f%n", valorAluguel);
        System.out.printf("Acréscimo por atraso (%.0f%%) : R$ %.2f%n",
                taxaAtraso * 100, valorAcrescimo);
        System.out.printf("Total com atraso        : R$ %.2f%n",
                valorAluguel + valorAcrescimo);
    }
}