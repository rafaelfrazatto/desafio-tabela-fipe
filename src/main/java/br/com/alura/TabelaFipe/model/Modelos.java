package br.com.alura.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Modelos(List<Dados> modelos) {

    public String formatarModelo(Dados dados) {
        return String.format("Código: %s | Modelo: %s", dados.codigo(), dados.nome());
    }

    public void exibirModelosFormatados() {
        modelos.stream()
                .sorted((m1, m2) -> m1.nome().compareToIgnoreCase(m2.nome()))
                .forEach(m -> System.out.println(formatarModelo(m)));
    }

}

