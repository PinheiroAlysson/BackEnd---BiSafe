package com.BioConnection.API.Controller;


import com.BioConnection.API.Model.DadosCadastrarPaciente;
import com.BioConnection.API.Model.vo.Paciente;
import com.BioConnection.API.DAO.PacienteRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/BioConnection")
public class PacienteController {

    @Autowired
    private PacienteRepository repository;

    @PostMapping("/CadastrarPaciente")
    @Transactional
    public void Cadastrar(@RequestBody @Valid DadosCadastrarPaciente dados) {
        repository.save(new Paciente(dados));
    }

    /*@GetMapping("/ListaPaciente")
    public Page<DadosListagemPaciente> listar(Pageable paginacao) {
        return repository.findAll(paginacao).map(DadosListagemPaciente::new);
    }*/

    @DeleteMapping("/DeletarPaciente/{id}")
    @Transactional
    public void excluir(@PathVariable Long id){
        repository.deleteById(id);
    }
}