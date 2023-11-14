package com.BiSafe.API.Bicicleta;

public record DadosListagemBicicleta (
        Long id,
        String marca,
        String modelo,
        String tipoBike,
        String cor,
        String numeroDeSerie,
        String tipoDeFreio,
        String tipoDeSuspensao,
        Integer marchas,
        Float aro,
        String itemPersonalizado) {
    public DadosListagemBicicleta(Bicicleta bike) {
        this(bike.getId(), bike.getMarca(), bike.getModelo(), bike.getTipoBike(), bike.getCor(), bike.getNumeroDeSerie(), bike.getTipoDeFreio(), bike.getTipoDeSuspensao(), bike.getMarchas(), bike.getAro(), bike.getItemPersonalizado());
    }
}