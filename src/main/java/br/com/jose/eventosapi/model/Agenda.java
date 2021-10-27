package br.com.jose.eventosapi.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agenda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAgenda;
	
	@Column
	private Long idPublico;
	
	@Column Long idArtista;
	
	@Column(nullable = false)
	private Date dataEvento;
	
	@Column(nullable = false)
	private String horaEvento;
	
	@Column(nullable = false)
	private String musicas;
	
	public Agenda() {
	}
	
	public Agenda(Long idAgenda, Long idPublico, Long idArtista, Date dataEvento, String horaEvento, String musicas) {
	this.idAgenda = idAgenda;	
	this.idPublico = idPublico;
	this.idArtista = idArtista;
	this.dataEvento = dataEvento;
	this.horaEvento = horaEvento;
	this.musicas = musicas;
	}
    
	public Long getIDAgenda() {
		return idAgenda;
	}
	
	public void setIdAgenda(Long idAgenda) {
		this.idAgenda = idAgenda;	
	}
    
	public Long getIdPublico() {
		return idPublico;
	}
	
	public void setIdPaciente(Long idPublico) {
		this.idPublico = idPublico;	
	}
	
	public Long getIdArtista() {
		return idArtista;
	}
	
	public void setIdArtista(Long idArtista) {
		this.idArtista = idArtista;	
	}
	
	public Date getDataEvento() {
		return dataEvento;
	}
	
	public void setDataEvento(Date dataEvento) {
		this.dataEvento = dataEvento;		
	}
	
	public String getHoraEvento() {
		return horaEvento;
	}
	
	public void setHoraEvento(String horaEvento) {
		this.horaEvento = horaEvento;
	}
	
	public String getMusicas() {
		return musicas;
	}
	
	public void setMusicas(String musicas) {
		this.musicas = musicas;
	}
	
}
