package br.com.alura.screenmatchfrases.dto;

import br.com.alura.screenmatchfrases.models.Frase;

public record FraseDTO (String titulo, String frase, String personagem, String poster) {
    public FraseDTO(Frase frase) {
        this(
                frase.getTitulo(),
                frase.getFrase(),
                frase.getPersonagem(),
                frase.getPoster()
        );
    }
}
