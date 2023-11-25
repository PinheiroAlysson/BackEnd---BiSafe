package com.BioConnection.API.DAO;

import com.BioConnection.API.Model.vo.ClinicoGeral;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicoRepository extends JpaRepository<ClinicoGeral, Long> {
    ClinicoGeral findByCPFAndSenha(String CPF, String senha);
}
