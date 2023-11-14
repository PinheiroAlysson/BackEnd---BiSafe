package com.BiSafe.API.Cliente;

import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoClientes(
        @NotNull
        Long id,
        String email,
        String telefoneResidencial,
        String telefoneCelular,
        String genero
) {
}
