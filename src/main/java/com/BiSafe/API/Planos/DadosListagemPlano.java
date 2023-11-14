package com.BiSafe.API.Planos;

public record DadosListagemPlano(
        Long id,
        String nome,
        String cpf,
        String tipo,
        String descricao,
        String valor
) {
    public DadosListagemPlano(Planos plano){
        this(plano.getId(), plano.getNome(), plano.getCpf(), plano.getTipo(), plano.getDescricao(), String.valueOf(plano.getValor()));
    }
}