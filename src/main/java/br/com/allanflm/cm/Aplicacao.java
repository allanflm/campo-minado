package br.com.allanflm.cm;

import br.com.allanflm.cm.modelo.Tabuleiro;
import br.com.allanflm.cm.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {

        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 3);
        new TabuleiroConsole(tabuleiro);

    }
}
