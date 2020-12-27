package com.sap.web.rest.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.validation.constraints.Max;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SchedulerTaskDTO {

	private Long id;
	@Max(250)
	private String name;
	@Max(30)
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
