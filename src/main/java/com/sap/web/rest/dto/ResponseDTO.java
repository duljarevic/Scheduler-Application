package com.sap.web.rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.util.List;

@JsonInclude(Include.NON_NULL)
public class ResponseDTO {

	private Object data;
	private List<String> messages;

	public ResponseDTO() {};

	public ResponseDTO(Object data) {
		super();
		this.data = data;
	};
	public ResponseDTO(Object data, List<String> messages) {
		super();
		this.data = data;
		this.messages = messages;
	};

	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public List<String> getMessages() {
		return messages;
	}
	public void setMessages(List<String> messages) {
		this.messages = messages;
	}
}
