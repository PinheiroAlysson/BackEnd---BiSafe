package com.BioConnection.API.Model.vo;

import com.BioConnection.API.Model.DadosClinico;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "Profissionais")
@Entity(name = "Profissional")
@Getter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")

public class ClinicoGeral {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String genero;
    private String email;
    private String CPF;
    private String senha;

    public ClinicoGeral(DadosClinico dados) {
        this.nome = dados.nome();
        this.genero = dados.genero();
        this.email = dados.email();
        this.CPF = dados.CPF();
        this.senha = dados.senha();
    }

    public void setId(Long id) {this.id = id;}

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
