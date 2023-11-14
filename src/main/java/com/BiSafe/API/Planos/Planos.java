package com.BiSafe.API.Planos;

import com.BiSafe.API.Cliente.DadosAtualizacaoClientes;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.logging.log4j.message.StringFormattedMessage;

@Table(name = "Planos")
@Entity(name = "Plano")
@Getter //gera os getters automaticamente pela dependencia "Lombook"
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Planos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String cpf;
    private String tipo;
    private String descricao;
    private Float valor;
    private boolean ativo;


    public Planos(DadosObterPlano dados) {
        this.nome = dados.nome();
        this.cpf = dados.cpf();
        this.tipo = dados.tipo();
        this.descricao = dados.descricao();
        this.valor = dados.valor();
        this.ativo = true;
    }

    public void excluir() {
        this.ativo = false;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public Float getValor() {
        return valor;
    }
}