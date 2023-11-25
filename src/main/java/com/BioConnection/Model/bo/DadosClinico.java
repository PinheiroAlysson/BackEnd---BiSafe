package com.BioConnection.Model.vo;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosClinico(
        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String CPF,
        @NotBlank
        String genero,
        @NotBlank
        String senha
) {
}
