package com.sap.services.servicesImpl;

import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.sap.web.rest.dto.SchedulerTaskDTO;
import com.sap.web.rest.exeption.CustomNotFoundException;
import com.sap.mapper.SchedulerTaskMapper;
import com.sap.model.SchedulerTask;
import com.sap.repository.SchedulerTaskRepository;
import com.sap.services.SchedulerTaskService;

@Service
@Transactional
public class SchedulerTaskServiceImpl implements SchedulerTaskService {

	private final Logger log = LoggerFactory.getLogger(SchedulerTaskServiceImpl.class);
	
	private SchedulerTaskRepository schedulerTaskRepository;
	private SchedulerTaskMapper schedulerTaskMapper;

	public SchedulerTaskServiceImpl(SchedulerTaskRepository schedulerTaskRepository, SchedulerTaskMapper schedulerTaskMapper) {
		this.schedulerTaskRepository = schedulerTaskRepository;
		this.schedulerTaskMapper = schedulerTaskMapper;
	}

	@Override
	public List<SchedulerTaskDTO> loadAll() {
		List<SchedulerTask> res = schedulerTaskRepository.findAll();
		List<SchedulerTaskDTO> res1 = schedulerTaskMapper.enitiesToDtos(res);
		return res1;
	}
	
	@Override
	public Long create(SchedulerTaskDTO input) {
		
		SchedulerTask entity = schedulerTaskMapper.dtoToEntity(input);
		SchedulerTask bill = schedulerTaskRepository.save(entity);
		return bill.getId();
	}
	
	@Override

	public void update(SchedulerTaskDTO input) throws Exception {
		
	
		SchedulerTask schedulerTask = schedulerTaskRepository.findById(input.getId()).orElse(null);
		if (input.getId() == null || schedulerTask == null) {
			throw new CustomNotFoundException("NOT FOUND");
		}
		
		schedulerTaskMapper.updateEntityFromDto(input, schedulerTask);
	    schedulerTaskRepository.save(schedulerTask);
		
	}
	
	@Override
	public void delete(Long id) {
		schedulerTaskRepository.deleteById(id);
	}
	
	@Override
	public SchedulerTaskDTO findById(Long id) throws Exception {
		
		
		if (id == null) {
			throw new Exception("NOT FOUND");
		}
		Optional<SchedulerTask> bill = schedulerTaskRepository.findById(id);
		SchedulerTask b = bill.orElseThrow(() -> new CustomNotFoundException("NOT FOUND"));
		SchedulerTaskDTO schedulerTaskDTO = schedulerTaskMapper.entityToDto(b);
		return schedulerTaskDTO;
	}
	
	@Override
	public boolean exists(Long id) {
		boolean bill = schedulerTaskRepository.existsById(id);
		return bill;
	}



}
