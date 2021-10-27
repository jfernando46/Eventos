package br.com.jose.eventosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jose.eventosapi.model.Convidados;

public interface ConvidadosRepository extends JpaRepository<Convidados, Long>{

}