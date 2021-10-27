package br.com.jose.eventosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jose.eventosapi.model.Artista;

public interface ArtistaRepository extends JpaRepository<Artista, Long>{

}
