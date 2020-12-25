package com.sap.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sap.model.SchedulerTask;


public interface SchedulerTaskRepository extends JpaRepository<SchedulerTask, Long> {
}
