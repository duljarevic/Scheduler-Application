package com.sap.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name = "scheduler_task")
public class SchedulerTask implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "naziv_izdavaoca")
	private String nazivIzdavaoca;
	
	@Column(name = "adresa_izdavaoca")
	private String adresaIzdavaoca;
	
	@Column(name = "naziv_primaoca")
	private String nazivPrimaoca;
	
	@Column(name = "adresa_primaoca")
	private String adresaPrimaoca;
	
	@Column(name = "tekuci_racun")
	private String tekuciRacun;
	
	@Column(name = "tekuci_racun_primaoca")
	private String tekuciRacunPrimaoca;
	
	@Column(name = "pibIzdavaoca")
	private Long pibIzdavaoca;
	
	@Column(name = "pibPrimaoca")
	private Long pibPrimaoca;
	
	@Column(name = "mesto_izdavanja_racuna")
	private String mestoIzdavanjaRacuna;
	
	@Column(name = "datum_izdavanja_racuna")
	private Date datumIzdavanjaRacuna;
	
	@Column(name = "datum_pometa_dobara_usluga")
	private Date datumPrometaDobaraUsluga;
	
	@Column(name = "vrsta_dobra_usluge")
	private String vrstaDobraUsluge;
	
	@Column(name = "jedinica_mere")
	private String jedinicaMere;
	
	@Column(name = "kolicina")
	private String kolicina;
	
	@Column(name = "cena_po_jedinici")
	private String cena;
	
	@Column(name = "poreska_osnovica")
	private String poreskaOsnovica;
	
	@Column(name = "stopa_pdv")
	private String sptopaPDV;
	
	@Column(name = "iznos_pdv")
	private Long iznosPDV;
	
	@Column(name = "napomena_o_poreskom_oslobodjenju")
	private String napomenaOPoreskomOslobodjenju;
	
	
	 @Version
	 @Column(name = "optlock", columnDefinition = "integer DEFAULT 0", nullable = false)
	 private long version = 0L;
	 
	 public SchedulerTask() {
		 super();
	 }

	public SchedulerTask(Long id, String nazivIzdavaoca, String adresaIzdavaoca, String nazivPrimaoca, String adresaPrimaoca,
						 String tekuciRacun, Long pibIzdavaoca, Long pibPrimaoca, String mestoIzdavanjaRacuna,
						 Date datumIzdavanjaRacuna, Date datumPrometaDobaraUsluga, String vrstaDobraUsluge, String jedinicaMere,
						 String kolicina, String cena, String poreskaOsnovica, String sptopaPDV, Long iznosPDV,
						 String napomenaOPoreskomOslobodjenju) {
		super();
		this.id = id;
		this.nazivIzdavaoca = nazivIzdavaoca;
		this.adresaIzdavaoca = adresaIzdavaoca;
		this.nazivPrimaoca = nazivPrimaoca;
		this.adresaPrimaoca = adresaPrimaoca;
		this.tekuciRacun = tekuciRacun;
		this.pibIzdavaoca = pibIzdavaoca;
		this.pibPrimaoca = pibPrimaoca;
		this.mestoIzdavanjaRacuna = mestoIzdavanjaRacuna;
		this.datumIzdavanjaRacuna = datumIzdavanjaRacuna;
		this.datumPrometaDobaraUsluga = datumPrometaDobaraUsluga;
		this.vrstaDobraUsluge = vrstaDobraUsluge;
		this.jedinicaMere = jedinicaMere;
		this.kolicina = kolicina;
		this.cena = cena;
		this.poreskaOsnovica = poreskaOsnovica;
		this.sptopaPDV = sptopaPDV;
		this.iznosPDV = iznosPDV;
		this.napomenaOPoreskomOslobodjenju = napomenaOPoreskomOslobodjenju;
	}




	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNazivIzdavaoca() {
		return nazivIzdavaoca;
	}


	public void setNazivIzdavaoca(String nazivIzdavaoca) {
		this.nazivIzdavaoca = nazivIzdavaoca;
	}


	public String getAdresaIzdavaoca() {
		return adresaIzdavaoca;
	}


	public void setAdresaIzdavaoca(String adresaIzdavaoca) {
		this.adresaIzdavaoca = adresaIzdavaoca;
	}


	public String getNazivPrimaoca() {
		return nazivPrimaoca;
	}


	public void setNazivPrimaoca(String nazivPrimaoca) {
		this.nazivPrimaoca = nazivPrimaoca;
	}


	public String getAdresaPrimaoca() {
		return adresaPrimaoca;
	}


	public void setAdresaPrimaoca(String adresaPrimaoca) {
		this.adresaPrimaoca = adresaPrimaoca;
	}


	public String getTekuciRacun() {
		return tekuciRacun;
	}


	public void setTekuciRacun(String tekuciRacun) {
		this.tekuciRacun = tekuciRacun;
	}


	public Long getPibIzdavaoca() {
		return pibIzdavaoca;
	}


	public void setPibIzdavaoca(Long pibIzdavaoca) {
		this.pibIzdavaoca = pibIzdavaoca;
	}


	public Long getPibPrimaoca() {
		return pibPrimaoca;
	}


	public void setPibPrimaoca(Long pibPrimaoca) {
		this.pibPrimaoca = pibPrimaoca;
	}


	public String getMestoIzdavanjaRacuna() {
		return mestoIzdavanjaRacuna;
	}


	public void setMestoIzdavanjaRacuna(String mestoIzdavanjaRacuna) {
		this.mestoIzdavanjaRacuna = mestoIzdavanjaRacuna;
	}


	public Date getDatumIzdavanjaRacuna() {
		return datumIzdavanjaRacuna;
	}


	public void setDatumIzdavanjaRacuna(Date datumIzdavanjaRacuna) {
		this.datumIzdavanjaRacuna = datumIzdavanjaRacuna;
	}


	public Date getDatumPrometaDobaraUsluga() {
		return datumPrometaDobaraUsluga;
	}


	public void setDatumPrometaDobaraUsluga(Date datumPrometaDobaraUsluga) {
		this.datumPrometaDobaraUsluga = datumPrometaDobaraUsluga;
	}


	public String getVrstaDobraUsluge() {
		return vrstaDobraUsluge;
	}


	public void setVrstaDobraUsluge(String vrstaDobraUsluge) {
		this.vrstaDobraUsluge = vrstaDobraUsluge;
	}


	public String getJedinicaMere() {
		return jedinicaMere;
	}


	public void setJedinicaMere(String jedinicaMere) {
		this.jedinicaMere = jedinicaMere;
	}


	public String getKolicina() {
		return kolicina;
	}


	public void setKolicina(String kolicina) {
		this.kolicina = kolicina;
	}


	public String getCena() {
		return cena;
	}


	public void setCena(String cena) {
		this.cena = cena;
	}


	public String getSptopaPDV() {
		return sptopaPDV;
	}


	public void setSptopaPDV(String sptopaPDV) {
		this.sptopaPDV = sptopaPDV;
	}


	public Long getIznosPDV() {
		return iznosPDV;
	}


	public void setIznosPDV(Long iznosPDV) {
		this.iznosPDV = iznosPDV;
	}


	public String getPoreskaOsnovica() {
		return poreskaOsnovica;
	}

	public void setPoreskaOsnovica(String poreskaOsnovica) {
		this.poreskaOsnovica = poreskaOsnovica;
	}

	public String getNapomenaOPoreskomOslobodjenju() {
		return napomenaOPoreskomOslobodjenju;
	}

	public void setNapomenaOPoreskomOslobodjenju(String napomenaOPoreskomOslobodjenju) {
		this.napomenaOPoreskomOslobodjenju = napomenaOPoreskomOslobodjenju;
	}

	public String getTekuciRacunPrimaoca() {
		return tekuciRacunPrimaoca;
	}

	public void setTekuciRacunPrimaoca(String tekuciRacunPrimaoca) {
		this.tekuciRacunPrimaoca = tekuciRacunPrimaoca;
	}
}
