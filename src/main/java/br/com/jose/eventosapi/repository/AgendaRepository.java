package br.com.jose.eventosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jose.eventosapi.model.Agenda;

public interface AgendaRepository extends JpaRepository<Agenda, Long> {

}
