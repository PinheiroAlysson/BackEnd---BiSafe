package com.BioConnection.API.Model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class DadosCadastrarPaciente {
    @NotBlank
    private String nomeCompleto;
    @NotBlank
    private String email;
    @NotBlank
    private String telefone;
    @NotBlank
    private String convenio;
    @NotBlank
    private String dataNascimento;
    @NotBlank
    private String CPF;
    @NotBlank
    private String senha;
    @NotBlank
    private String confirmarSenha;

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getConvenio() {
        return convenio;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getCPF() {
        return CPF;
    }

    public String getSenha() {
        return senha;
    }

    public String getConfirmarSenha() {
        return confirmarSenha;
    }

    public void confirmar() throws Exception {
    }
}
