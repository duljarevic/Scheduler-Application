package com.sap.controller;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.sap.dto.ResponseDTO;
import com.sap.dto.SchedulerTaskDTO;
import com.sap.exeption.CustomNotFoundException;
import com.sap.services.SchedulerTaskService;

/**
 * REST controller for managing {@link com.sap.model.SchedulerTask}.
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api")
public class SchedulerTaskController {

	private final Logger log = LoggerFactory.getLogger(SchedulerTaskController.class);

	public SchedulerTaskService schedulerTaskServices;

	public SchedulerTaskController(SchedulerTaskService schedulerTaskServices) {
		this.schedulerTaskServices = schedulerTaskServices;
	}

	@GetMapping(value = "/scheduler-tasks")
	public ResponseEntity<?> getAllTasks() {
		log.debug("REST request to get Scheduler Tasks : {}");
		List<SchedulerTaskDTO> res = schedulerTaskServices.loadAll();
		return new ResponseEntity(new ResponseDTO(res), HttpStatus.OK);
	}

	@GetMapping(value = "/scheduler-task/{id}")
	ResponseEntity<?> findTaskById(@PathVariable Long id) throws Exception {
		log.debug("REST request to get Scheduler Tasks by id: {}", id);
		SchedulerTaskDTO bill = this.schedulerTaskServices.findById(id);
		return new ResponseEntity<>(new ResponseDTO(bill), HttpStatus.OK);
	}
	
	@PostMapping(value= "/scheduler-task")
	ResponseEntity<?> addNewTask(@RequestBody SchedulerTaskDTO input) throws Exception {
		log.debug("REST request to post Scheduler Tasks : {}", input.getName());
		Long id = this.schedulerTaskServices.create(input);
		SchedulerTaskDTO bill = this.schedulerTaskServices.findById(id);
		return new ResponseEntity<>(new ResponseDTO(bill), HttpStatus.CREATED);
	}

	@PutMapping(value = "/scheduler-task/{id}")
	ResponseEntity<?> updateTask(@PathVariable Long id, @RequestBody SchedulerTaskDTO input) throws Exception {
		log.debug("REST request to update Scheduler Tasks by id : {}", id);
		this.schedulerTaskServices.update(input);
		SchedulerTaskDTO bill = this.schedulerTaskServices.findById(id);
		return new ResponseEntity<>(new ResponseDTO(bill), HttpStatus.OK);
	}

	@DeleteMapping(value = "/scheduler-task/{id}")
	ResponseEntity<?> deleteTask(@PathVariable Long id) throws Exception {
		log.debug("REST request to delete Scheduler Tasks by id : {}", id);
		if (id == null || !schedulerTaskServices.exists(id)) {
			throw new CustomNotFoundException("NOT FOUND");
		}
		this.schedulerTaskServices.delete(id);
		return new ResponseEntity<>(new ResponseDTO("OK"), HttpStatus.OK);
	}
}
