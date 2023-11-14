package com.BiSafe.API.Cliente;

public record DadosListagemClientes(
        Long id,
        String nome,
        String sobrenome,
        String rg,
        String cpf,
        String telefoneCelular,
        String genero,
        String dataNascimento
) { public DadosListagemClientes(Cliente cliente){
    this(cliente.getId(), cliente.getNome(), cliente.getSobrenome(), cliente.getRg(), cliente.getCpf(), cliente.getTelefoneCelular(), cliente.getGenero(), cliente.getDataNascimento());
}
}
