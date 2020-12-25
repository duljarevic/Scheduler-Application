package com.sap.mapper;

import com.sap.dto.BillsDTO;
import com.sap.model.SchedulerTask;
import java.util.List;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel="spring")
public interface SchedulerTaskMapper {

	BillsDTO entityToDto(SchedulerTask entity);
	SchedulerTask dtoToEntity(BillsDTO dto);
	SchedulerTask updateEntityFromDto(BillsDTO dto, @MappingTarget SchedulerTask entity);
    List<BillsDTO> enitiesToDtos(List<SchedulerTask> enities);
}
