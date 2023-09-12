package br.com.etechoracio.pw3viagens.Controller;

import br.com.etechoracio.pw3viagens.Entity.Viagem;
import br.com.etechoracio.pw3viagens.Repository.ViagensRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/viagens")

public class ViagemController {
    @Autowired
    private ViagensRepository repository;

    @GetMapping
    public List<Viagem> buscarTodos() {

        return repository.findAll();
    }

    @GetMapping("@/{id}")
    public Optional<Viagem> buscarporId(@PathVariable Long id){
        return repository.findById(id);
    }

}
