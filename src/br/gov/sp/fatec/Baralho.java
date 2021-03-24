package br.gov.sp.fatec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Baralho {
    private List<Carta> cartas;

    public void montar() {
        cartas = new ArrayList<>();
        for (Valor v : Valor.values()) {
            for (Naipe n : Naipe.values()) {
                Carta carta = new Carta();
                carta.setValor(v);
                carta.setNaipe(n);
                cartas.add(carta);
            }
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public void exibir() {
        for (Carta carta : cartas) {
            StringBuilder string = new StringBuilder(String.valueOf(carta.getValor()));
            string.append(" de ");
            string.append(carta.getNaipe());
            System.out.println(string.toString());
        }
        System.out.println(cartas.size());
    }
}
