package com.BioConnection.API.Controller;

import com.BioConnection.API.DAO.ClinicoRepository;
import com.BioConnection.API.Model.DadosClinico;
import com.BioConnection.API.Model.vo.ClinicoGeral;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/BioConnection")
public class ClinicoController {

    @Autowired
    private ClinicoRepository repository;

    @PostMapping("/DadosClinico")
    @Transactional
    public void cadastrar(DadosClinico dados){
        repository.save(new ClinicoGeral(dados));
    }

}
