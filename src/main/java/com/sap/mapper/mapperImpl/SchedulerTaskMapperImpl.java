package com.sap.mapper.mapperImpl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;
import com.sap.web.rest.dto.SchedulerTaskDTO;
import com.sap.mapper.SchedulerTaskMapper;
import com.sap.model.SchedulerTask;

@Component
public class SchedulerTaskMapperImpl implements SchedulerTaskMapper {

	@Override
	public SchedulerTaskDTO entityToDto(SchedulerTask entity) {
		
		if ( entity == null ) {
            return null;
        }
		
		SchedulerTaskDTO schedulerTaskDTO = new SchedulerTaskDTO();
		
		schedulerTaskDTO.setId(entity.getId());
		schedulerTaskDTO.setName(entity.getName());
		schedulerTaskDTO.setCode(entity.getCode());
		schedulerTaskDTO.setRecurrency(entity.getRecurrency());
		return schedulerTaskDTO;
	}

	@Override
	public SchedulerTask dtoToEntity(SchedulerTaskDTO dto) {
		  if ( dto == null ) {
	            return null;
	        }
		SchedulerTask schedulerTask = new SchedulerTask();
		schedulerTask.setId(dto.getId());
		schedulerTask.setName(dto.getName());
		schedulerTask.setRecurrency(dto.getRecurrency());
		schedulerTask.setCode(dto.getCode());
		return schedulerTask;
	}

	public SchedulerTask updateEntityFromDto(SchedulerTaskDTO dto, SchedulerTask entity) {
		 if ( dto == null ) {
	            return null;
	        }
		 entity.setId(dto.getId());
		 entity.setName(dto.getName());
		 entity.setCode(dto.getCode());
		 entity.setRecurrency(dto.getRecurrency());


		return entity;
	}

	@Override
	public List<SchedulerTaskDTO> enitiesToDtos(List<SchedulerTask> enities) {
		if ( enities == null ) {
            return null;
        }
		 List<SchedulerTaskDTO> list = new ArrayList<SchedulerTaskDTO>(enities.size());
	        for ( SchedulerTask schedulerTask : enities ) {
	            list.add( entityToDto(schedulerTask));
	        }
		return list;
	}
}
