package br.com.jose.eventosapi.model;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ParticipantesdoEvento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idParticipantesdoEvento;
	
	@Column(length=100,nullable=false)
	private String nomeParticipantesdoEvento;
	
	@Column(length=100,nullable=false, unique = true)
	private String emailParticipantesdoEvento;
	
	@Column
	private String telefoneParticipantesdoEvento;
	
	public ParticipantesdoEvento() {
		
	}

	public ParticipantesdoEvento(Long idParticipantesdoEvento, String nomeParticipantesdoEvento,
			String emailParticipantesdoEvento, String telefoneParticipantesdoEvento) {
		this.idParticipantesdoEvento = idParticipantesdoEvento;
		this.nomeParticipantesdoEvento = nomeParticipantesdoEvento;
		this.emailParticipantesdoEvento = emailParticipantesdoEvento;
		this.telefoneParticipantesdoEvento = telefoneParticipantesdoEvento;
	}

	public Long getIdParticipantesdoEvento() {
		return idParticipantesdoEvento;
	}

	public void setIdParticipantesdoEvento(Long idParticipantesdoEvento) {
		this.idParticipantesdoEvento = idParticipantesdoEvento;
	}

	public String getNomeParticipantesdoEvento() {
		return nomeParticipantesdoEvento;
	}

	public void setNomeParticipantesdoEvento(String nomeParticipantesdoEvento) {
		this.nomeParticipantesdoEvento = nomeParticipantesdoEvento;
	}

	public String getEmailParticipantesdoEvento() {
		return emailParticipantesdoEvento;
	}

	public void setEmailParticipantesdoEvento(String emailParticipantesdoEvento) {
		this.emailParticipantesdoEvento = emailParticipantesdoEvento;
	}

	public String getTelefoneParticipantesdoEvento() {
		return telefoneParticipantesdoEvento;
	}

	public void setTelefoneParticipantesdoEvento(String telefoneParticipantesdoEvento) {
		this.telefoneParticipantesdoEvento = telefoneParticipantesdoEvento;
	}
	

}
