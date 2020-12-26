package com.sap.mapper;

import com.sap.dto.SchedulerTaskDTO;
import com.sap.model.SchedulerTask;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel="spring")
public interface SchedulerTaskMapper {

	SchedulerTaskDTO entityToDto(SchedulerTask entity);
	SchedulerTask dtoToEntity(SchedulerTaskDTO dto);
	SchedulerTask updateEntityFromDto(SchedulerTaskDTO dto, @MappingTarget SchedulerTask entity);
    List<SchedulerTaskDTO> enitiesToDtos(List<SchedulerTask> enities);
}
