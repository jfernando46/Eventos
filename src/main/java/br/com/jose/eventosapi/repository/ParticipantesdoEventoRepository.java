package br.com.jose.eventosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jose.eventosapi.model.Convidados;
import br.com.jose.eventosapi.model.ParticipantesdoEvento;

public interface ParticipantesdoEventoRepository extends JpaRepository<ParticipantesdoEvento , Long>{

	void save(Convidados convidados);

}
