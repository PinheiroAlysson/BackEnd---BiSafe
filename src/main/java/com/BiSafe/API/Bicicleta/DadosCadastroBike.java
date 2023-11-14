package com.BiSafe.API.Bicicleta;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroBike(
    @NotBlank
    String marca,
    @NotBlank
    String modelo,
    @NotBlank
    String tipoBike,
    @NotBlank
    String cor,
    @NotNull
    String numeroDeSerie,
    @NotBlank
    String tipoDeFreio,
    @NotBlank
    String tipo_De_Suspensao,
    @NotNull
    Integer marchas,
    @NotNull
    Float aro,
    @NotBlank
    String itemPersonalizado
)
{}
