package br.com.alura.TabelaFipe.model;

public record Dados(String codigo, String nome) {

    public String formatarDados() {
        return String.format("Código: %s | Marca: %s", codigo, nome);
    }
}

