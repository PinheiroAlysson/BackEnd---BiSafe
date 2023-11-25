package com.BioConnection.API.Model.Service;

public class Login {
    private String CPF;
    private String senha;

    public Login(String user, String passworld) {
        this.CPF = user;
        this.senha = passworld;
    }

    public String getCpf() {
        return CPF;
    }

    public void setCpf(String CPF) {
        this.CPF = CPF;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
