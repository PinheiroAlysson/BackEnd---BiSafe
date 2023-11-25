package com.BioConnection.API.Model;

import com.BioConnection.Model.vo.Paciente;

public record DadosListagemPaciente(
        String nomeCompleto,
        String dataNascimento,
        String CPF,
        String email,
        String telefone,
        String convenio
) {
    public DadosListagemPaciente(Paciente paciente){
        this(paciente.getNomeCompleto(), paciente.getDataNascimento(), paciente.getCPF(), paciente.getEmail(), paciente.getTelefone(), paciente.getConvenio());
    }
}
