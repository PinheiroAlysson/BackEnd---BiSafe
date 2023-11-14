package com.BiSafe.API.Cliente;


import com.BiSafe.API.Endereco.Endereco;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Clientes")
@Entity(name = "Cliente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String sobrenome;
    private String rg;
    private String cpf;
    private String email;
    private String telefoneResidencial;
    private String telefoneCelular;
    private String genero;
    private String dataNascimento;
    private boolean ativo;

    @Embedded
    private Endereco endereco;

    public Cliente(DadosCadastroCliente dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.sobrenome = dados.sobrenome();
        this.rg = dados.RG();
        this.cpf = dados.CPF();
        this.email = dados.email();
        this.telefoneResidencial = dados.telefoneResidencial();
        this.telefoneCelular = dados.telefoneCelular();
        this.genero = dados.genero();
        this.dataNascimento = dados.dataNascimento();
        this.endereco = new Endereco(dados.endereco());
    }

    public void excluir() {
        this.ativo = false;
    }

    public void atualizarInformacoes(DadosAtualizacaoClientes dados) {
        if (dados.email() != null){
            this.email =dados.email();
        }
        if (dados.telefoneResidencial() != null){
            this.telefoneResidencial = dados.telefoneResidencial();
        }
        if (dados.telefoneCelular() != null){
            this.telefoneCelular = dados.telefoneCelular();
        }
        if (dados.genero() != null){
            this.genero = dados.genero();
        }
    }
}
