package br.com.alura.TabelaFipe.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public record Veiculo(
        @JsonAlias("Valor") String valor,
        @JsonAlias("Marca") String marca,
        @JsonAlias("Modelo") String modelo,
        @JsonAlias("AnoModelo") Integer ano,
        @JsonAlias("Combustivel") String tipoCombustivel){

    public String formatarDados() {
        return String.format("\nModelo: %s\nMarca: %s\nAno: %d\nTipo do Combustível: %s\nValor: %s",
                modelo, marca, ano, tipoCombustivel, valor);
    }

}
