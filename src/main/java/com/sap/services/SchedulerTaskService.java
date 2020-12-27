package com.sap.services;

import com.sap.web.rest.exeption.CustomNotFoundException;
import java.util.List;

import com.sap.web.rest.dto.SchedulerTaskDTO;
import java.util.Optional;

public interface SchedulerTaskService {
	
	List<SchedulerTaskDTO> loadAll();
	Long create(SchedulerTaskDTO input);
	void update(SchedulerTaskDTO input) throws Exception;
	void delete(Long id) throws CustomNotFoundException;
	Optional<SchedulerTaskDTO> findById(Long id) throws Exception;
	boolean exists(Long id);

}
