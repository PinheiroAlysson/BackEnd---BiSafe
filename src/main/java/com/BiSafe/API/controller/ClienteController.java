package com.BiSafe.API.controller;

import com.BiSafe.API.Cliente.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/client")
public class ClienteController {

    @Autowired
    private ClienteRepository repository;

    @PostMapping("CadastrarCliente")
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroCliente dados){
        repository.save(new Cliente(dados));
    }

    @GetMapping("/ListagemClientes")
    @Transactional
    public Page<DadosListagemClientes> lista (Pageable paginacao){
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemClientes::new);
    }

    @Transactional
    @PutMapping("/AtualizacaoCliente")
    public void atualizar(@RequestBody @Valid DadosAtualizacaoClientes dados){
        var cliente = repository.getReferenceById(dados.id());
        cliente.atualizarInformacoes(dados);
    }

    @DeleteMapping("/delete/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        var cliente = repository.getReferenceById(id);
        cliente.excluir();
    }
}
