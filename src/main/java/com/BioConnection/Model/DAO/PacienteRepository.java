package com.BioConnection.API.DAO;

import com.BioConnection.API.Model.vo.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository <Paciente, Long> {
    Paciente findByCPFAndSenha(String cpf, String senha);

}
