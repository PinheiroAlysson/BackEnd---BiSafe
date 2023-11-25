package com.BioConnection.API.Controller;

import com.BioConnection.API.DAO.ClinicoRepository;
import com.BioConnection.API.DAO.PacienteRepository;
import com.BioConnection.API.Model.Service.Login;
import com.BioConnection.API.Model.vo.ClinicoGeral;
import com.BioConnection.API.Model.vo.Paciente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.security.auth.login.LoginException;

@RestController
@RequestMapping("/login")
public class LoginController {
    @Autowired
    private PacienteRepository pacienteRepository;
    @Autowired
    private ClinicoRepository clinicoRepository;

    @PostMapping("/Paciente")
    public String logarPaciente(Login login) throws LoginException {

        Paciente paciente = pacienteRepository.findByCPFAndSenha(login.getCpf(), login.getSenha());

        if (paciente != null) {
            return "***ACESSANDO ÁREA DO PACIENTE***";
        } else {
            throw new LoginException("USUÁRIO INVALIDO, tente novamente.");
        }
    }

    @PostMapping("/ClincoGeral")
    public String logarClinico(Login login) throws LoginException {

        ClinicoGeral clinico = clinicoRepository.findByCPFAndSenha(login.getCpf(), login.getSenha());

        if (clinico != null) {
            return "***ACESSANDO ÁREA DO CLINICO***";
        } else {
            throw new LoginException("USUÁRIO INVALIDO, tente novamente.");
        }
    }

}
