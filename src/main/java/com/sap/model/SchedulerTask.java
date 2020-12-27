package com.sap.model;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Max;

@Entity
@Table(name = "scheduler_task")
public class SchedulerTask implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "name", length = 250)
	private String name;
	
	@Column(name = "recurrency", length = 30)
	private String recurrency;

	@Column(name = "code")
	private String code;

	@Version
	@Column(name = "version", columnDefinition = "integer DEFAULT 0", nullable = false)
	private long version = 0L;

	public SchedulerTask() {}

	public SchedulerTask(Long id, String name, String recurrency, String code) {
		this.id = id;
		this.name = name;
		this.recurrency = recurrency;
		this.code = code;
	}

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

	@Override
	public String toString() {
		return "SchedulerTask{" +
				"id=" + id +
				", name='" + name + '\'' +
				", recurrency='" + recurrency + '\'' +
				", code='" + code + '\'' +
				'}';
	}
}
