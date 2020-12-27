package com.sap.web.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import javax.validation.constraints.Size;

@JsonInclude(Include.NON_NULL)
public class SchedulerTaskDTO {

	private Long id;
	@Size(max = 250)
	private String name;
	@Size(max = 30)
	private String recurrency;
	private String code;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRecurrency() {
		return recurrency;
	}

	public void setRecurrency(String recurrency) {
		this.recurrency = recurrency;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
