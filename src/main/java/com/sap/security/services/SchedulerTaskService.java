package com.sap.security.services;

import java.util.List;

import com.sap.dto.BillsDTO;

public interface SchedulerTaskService {
	
	List<BillsDTO> loadAll();
	Long create(BillsDTO input);
	void update(BillsDTO input) throws Exception;
	void delete(Long id);
	BillsDTO findById(Long id) throws Exception;
	boolean exists(Long id);

}
