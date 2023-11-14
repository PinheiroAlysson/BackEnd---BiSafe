package com.BiSafe.API.controller;

import com.BiSafe.API.Bicicleta.Bicicleta;
import com.BiSafe.API.Bicicleta.BicicletaRepository;
import com.BiSafe.API.Bicicleta.DadosCadastroBike;
import com.BiSafe.API.Bicicleta.DadosListagemBicicleta;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/bikes")
public class BicicletaController {

    @Autowired
    private BicicletaRepository repository;

    @PostMapping("/CadastrarBike")
    @Transactional
    public void Cadastrar(@RequestBody @Valid DadosCadastroBike dados) {
        repository.save(new Bicicleta(dados));
    }

    @GetMapping("/ListagemBike")
    public Page<DadosListagemBicicleta> listar(Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemBicicleta::new);
    }

    @DeleteMapping("/DeletarBike/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        var bicicleta = repository.getReferenceById(id);
        bicicleta.excluir();
    }
}