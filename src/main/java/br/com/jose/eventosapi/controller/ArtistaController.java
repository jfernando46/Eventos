package br.com.jose.eventosapi.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.jose.eventosapi.model.Artista;
import br.com.jose.eventosapi.repository.ArtistaRepository;

@RestController
@RequestMapping("/artista")
public class ArtistaController {
	
	@Autowired
	private ArtistaRepository mr;
	
    @GetMapping("/listar")
	public List<Artista> listar(){
		return mr.findAll();
	}

    @PostMapping("/cadastro")
	public String cadastro(Artista artista) {
    	mr.save(artista);
    	return "Artista cadastrado com sucesso";
    }
	
    @PutMapping("/atualizar/{id}")
	public String atualizar(@RequestBody Artista artista, @PathVariable Long id) {
    	Optional<Artista> me = mr.findById(id);
    	if(!me.isPresent()) {
    		return "O artista não foi localizado";
    	}
    	
    	artista.setIdArtista(id);
    	mr.save(artista);
    	return "Artista atualizado com sucesso";
    	
    }
		
	@DeleteMapping("/apagar/{id}")
	public String apagar(@PathVariable Long id) {
		mr.deleteById(id);
		return "Artista apagado";
	}
}	