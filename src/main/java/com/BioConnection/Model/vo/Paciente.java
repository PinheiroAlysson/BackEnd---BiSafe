package com.BioConnection.API.Model.vo;

import com.BioConnection.API.Model.DadosCadastrarPaciente;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Pacientes")
@Entity(name = "Paciente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomeCompleto;
    private String email;
    private String telefone;
    private String convenio;
    private String dataNascimento;
    private String CPF;
    private String senha;

    public Paciente(DadosCadastrarPaciente dados) {
        this.nomeCompleto = dados.getNomeCompleto();
        this.email = dados.getEmail();
        this.telefone = dados.getTelefone();
        this.convenio = dados.getConvenio();
        this.dataNascimento = dados.getDataNascimento();
        this.CPF = dados.getCPF();
        this.senha = dados.getSenha();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
