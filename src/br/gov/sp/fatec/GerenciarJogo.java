package br.gov.sp.fatec;

public class GerenciarJogo {

    private Baralho baralho;

    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        baralho.montar();
        baralho.embaralhar();
        baralho.exibir();
    }
}
