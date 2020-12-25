package com.sap.mapperImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sap.dto.BillsDTO;
import com.sap.mapper.SchedulerTaskMapper;
import com.sap.model.SchedulerTask;

@Component
public class SchedulerTaskMapperImpl implements SchedulerTaskMapper {

	@Override
	public BillsDTO entityToDto(SchedulerTask entity) {
		
		if ( entity == null ) {
            return null;
        }
		
		BillsDTO billsDTO = new BillsDTO();
		
		billsDTO.setId(entity.getId());
		billsDTO.setNazivIzdavaoca(entity.getNazivIzdavaoca());
		billsDTO.setAdresaIzdavaoca(entity.getAdresaIzdavaoca());
		billsDTO.setNazivPrimaoca(entity.getNazivIzdavaoca());;
		billsDTO.setAdresaPrimaoca(entity.getAdresaPrimaoca());;
		billsDTO.setTekuciRacun(entity.getTekuciRacun());
		billsDTO.setPibIzdavaoca(entity.getPibIzdavaoca());
		billsDTO.setPibPrimaoca(entity.getPibPrimaoca());
		billsDTO.setMestoIzdavanjaRacuna(entity.getMestoIzdavanjaRacuna());
		billsDTO.setDatumIzdavanjaRacuna(entity.getDatumIzdavanjaRacuna());
		billsDTO.setDatumPrometaDobaraUsluga(entity.getDatumPrometaDobaraUsluga());
		billsDTO.setVrstaDobraUsluge(entity.getVrstaDobraUsluge());
		billsDTO.setJedinicaMere(entity.getJedinicaMere());
		billsDTO.setKolicina(entity.getKolicina());
		billsDTO.setCena(entity.getCena());
		billsDTO.setPoreskaOsnovica(entity.getPoreskaOsnovica());
		billsDTO.setSptopaPDV(entity.getSptopaPDV());
		billsDTO.setIznosPDV(entity.getIznosPDV());
		billsDTO.setNapomenaOPoreskomOslobodjenju(entity.getNapomenaOPoreskomOslobodjenju());
		billsDTO.setTekuciRacunPrimaoca(entity.getTekuciRacunPrimaoca());
		
		return billsDTO;
	}

	@Override
	public SchedulerTask dtoToEntity(BillsDTO dto) {
		
		  if ( dto == null ) {
	            return null;
	        }
		
		SchedulerTask schedulerTask = new SchedulerTask();
		
		schedulerTask.setId(dto.getId());
		schedulerTask.setNazivIzdavaoca(dto.getNazivIzdavaoca());
		schedulerTask.setAdresaIzdavaoca(dto.getAdresaIzdavaoca());
		schedulerTask.setNazivPrimaoca(dto.getNazivIzdavaoca());;
		schedulerTask.setAdresaPrimaoca(dto.getAdresaPrimaoca());;
		schedulerTask.setTekuciRacun(dto.getTekuciRacun());
		schedulerTask.setPibIzdavaoca(dto.getPibIzdavaoca());
		schedulerTask.setPibPrimaoca(dto.getPibPrimaoca());
		schedulerTask.setMestoIzdavanjaRacuna(dto.getMestoIzdavanjaRacuna());
		schedulerTask.setDatumIzdavanjaRacuna(dto.getDatumIzdavanjaRacuna());
		schedulerTask.setDatumPrometaDobaraUsluga(dto.getDatumPrometaDobaraUsluga());
		schedulerTask.setVrstaDobraUsluge(dto.getVrstaDobraUsluge());
		schedulerTask.setJedinicaMere(dto.getJedinicaMere());
		schedulerTask.setKolicina(dto.getKolicina());
		schedulerTask.setCena(dto.getCena());
		schedulerTask.setPoreskaOsnovica(dto.getPoreskaOsnovica());
		schedulerTask.setSptopaPDV(dto.getSptopaPDV());
		schedulerTask.setIznosPDV(dto.getIznosPDV());
		schedulerTask.setNapomenaOPoreskomOslobodjenju(dto.getNapomenaOPoreskomOslobodjenju());
		schedulerTask.setTekuciRacunPrimaoca(dto.getTekuciRacunPrimaoca());
		return schedulerTask;
	}

	@Override
	public SchedulerTask updateEntityFromDto(BillsDTO dto, SchedulerTask entity) {
		
		 if ( dto == null ) {
	            return null;
	        }
		 
		 entity.setId(dto.getId());
		 entity.setNazivIzdavaoca(dto.getNazivIzdavaoca());
		 entity.setAdresaIzdavaoca(dto.getAdresaIzdavaoca());
		 entity.setNazivPrimaoca(dto.getNazivIzdavaoca());;
		 entity.setAdresaPrimaoca(dto.getAdresaPrimaoca());;
		 entity.setTekuciRacun(dto.getTekuciRacun());
		 entity.setPibIzdavaoca(dto.getPibIzdavaoca());
		 entity.setPibPrimaoca(dto.getPibPrimaoca());
		 entity.setMestoIzdavanjaRacuna(dto.getMestoIzdavanjaRacuna());
		 entity.setDatumIzdavanjaRacuna(dto.getDatumIzdavanjaRacuna());
		 entity.setDatumPrometaDobaraUsluga(dto.getDatumPrometaDobaraUsluga());
		 entity.setVrstaDobraUsluge(dto.getVrstaDobraUsluge());
		 entity.setJedinicaMere(dto.getJedinicaMere());
		 entity.setKolicina(dto.getKolicina());
		 entity.setCena(dto.getCena());
		 entity.setPoreskaOsnovica(dto.getPoreskaOsnovica());
		 entity.setSptopaPDV(dto.getSptopaPDV());
		 entity.setIznosPDV(dto.getIznosPDV());
		 entity.setNapomenaOPoreskomOslobodjenju(dto.getNapomenaOPoreskomOslobodjenju());
		 entity.setTekuciRacunPrimaoca(dto.getTekuciRacunPrimaoca());
	
		return entity;
	}

	@Override
	public List<BillsDTO> enitiesToDtos(List<SchedulerTask> enities) {
		if ( enities == null ) {
            return null;
        }
		
		
		 List<BillsDTO> list = new ArrayList<BillsDTO>(enities.size());
	        for ( SchedulerTask schedulerTask : enities ) {
	            list.add( entityToDto(schedulerTask));
	        }
		
		return list;
	}



}
