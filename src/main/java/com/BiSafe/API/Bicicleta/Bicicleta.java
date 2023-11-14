package com.BiSafe.API.Bicicleta;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Table(name = "Bicicletas")
@Entity(name = "bicicleta")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")

public class Bicicleta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private String modelo;
    private String tipoBike;
    private String cor;
    private String numeroDeSerie;
    private String tipoDeFreio;
    private String tipoDeSuspensao;
    private Integer marchas;
    private Float aro;
    private String itemPersonalizado;
    private boolean ativo;

    public Bicicleta(DadosCadastroBike dados) {
        this.ativo = true;
        this.marca = dados.marca();
        this.modelo = dados.modelo();
        this.tipoBike = dados.tipoBike();
        this.cor = dados.cor();
        this.numeroDeSerie = dados.numeroDeSerie();
        this.tipoDeFreio = dados.tipoDeFreio();
        this.tipoDeSuspensao = dados.tipo_De_Suspensao();
        this.marchas = dados.marchas();
        this.aro = dados.aro();
        this.itemPersonalizado = dados.itemPersonalizado();
    }

    public void excluir() {
        this.ativo = false;
    }
}
