package com.BiSafe.API.controller;

import com.BiSafe.API.Cliente.DadosAtualizacaoClientes;
import com.BiSafe.API.Planos.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RequestMapping("planos")
@RestController

public class PlanosController {
    @Autowired
    private PlanosRepository repository;

    @PostMapping("/obterPlano")
    @Transactional
    public void obterPlano(@RequestBody @Valid DadosObterPlano dados) {
        repository.save(new Planos(dados));
    }

    @GetMapping("/DadosPlano")
    @Transactional
    public Page<DadosListagemPlano> listar(Pageable paginacao) {
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemPlano::new);
    }

    @DeleteMapping("/delete/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        var planos = repository.getReferenceById(id);
        planos.excluir();
    }
}
