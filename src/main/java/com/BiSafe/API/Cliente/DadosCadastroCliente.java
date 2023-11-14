package com.BiSafe.API.Cliente;

import com.BiSafe.API.Endereco.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroCliente(
        @NotBlank
        String nome,
        @NotBlank
        String sobrenome,
        @NotBlank
        @Pattern(regexp = "\\d{2}\\.?\\d{3}\\.?\\d{3}\\-?\\d{1}")
        String RG,
        @NotBlank
        @Pattern(regexp = "\\d{3}\\.?\\d{3}\\.?\\d{3}\\-?\\d{2}")
        String CPF,
        @NotBlank
        @Email
        String email,
        @NotNull
        String telefoneResidencial,
        @NotNull
        String telefoneCelular,
        @NotBlank
        String genero,
        @NotBlank
        String dataNascimento,

        @NotNull
        @Valid
        DadosEndereco endereco
) {
}
