package Imobiliaria;
//class financeiro com intarface para calculo de juros, desconto e acréscimo

public interface Financeiro {

    // Calcula juros compostos
    public static float calcularFinanciamento(float montante, int meses, float taxa) {
        float valorFinal = montante;
        for (int i = 0; i < meses; i++) {
            valorFinal += valorFinal * taxa; 
        }
        return valorFinal;

    }

    // Calcula e retorna o valor de acréscimo (juros simples sobre o montante)
    public static float calcularAcrescimo(float montante, float juros) {
        return montante * juros;
    }

    // Calcula e retorna o valor de desconto sobre o montante
    public static float calcularDesconto(float montante, float percentual) {
        return montante * percentual;
    }
}