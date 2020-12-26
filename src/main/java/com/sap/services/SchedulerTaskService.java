package com.sap.services;

import java.util.List;

import com.sap.dto.SchedulerTaskDTO;

public interface SchedulerTaskService {
	
	List<SchedulerTaskDTO> loadAll();
	Long create(SchedulerTaskDTO input);
	void update(SchedulerTaskDTO input) throws Exception;
	void delete(Long id);
	SchedulerTaskDTO findById(Long id) throws Exception;
	boolean exists(Long id);

}
