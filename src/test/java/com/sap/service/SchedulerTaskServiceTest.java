package com.sap.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sap.mapper.SchedulerTaskMapper;
import com.sap.model.SchedulerTask;
import com.sap.repository.SchedulerTaskRepository;
import com.sap.services.SchedulerTaskService;
import com.sap.web.rest.dto.SchedulerTaskDTO;
import com.sap.web.rest.exeption.CustomNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringRunner.class)
@SpringBootTest
public class SchedulerTaskServiceTest {

  /**
   * Autowire in the service we Scheduler to test
   */
  @Autowired
  private SchedulerTaskService schedulerTaskService;
  @Autowired
  private SchedulerTaskMapper schedulerTaskMapper;
  @Autowired
  private WebApplicationContext context;
  /**
   * Create a mock implementation of the SchedulerRepository
   */
  @MockBean
  private SchedulerTaskRepository schedulerRepository;


  @Test
  @DisplayName("Test findAll")
  public void testFindAll() {
    // Setup our mock repository
    SchedulerTask schedulerTask1 = new SchedulerTask(1l, "Scheduler name1", "Scheduler recurrency",
        "Scheduler code");
    SchedulerTask schedulerTask2 = new SchedulerTask(2l, "Scheduler 2 name",
        "Scheduler 2 recurrency", "Scheduler 2 code");
    doReturn(Arrays.asList(schedulerTask1, schedulerTask2)).when(schedulerRepository).findAll();
    // Execute the service call
    List<SchedulerTaskDTO> schedulerTaskDTOS = schedulerTaskService.loadAll();
    // Assert the response
    Assertions.assertEquals(2, schedulerTaskDTOS.size(), "findAll should return 2 widgets");
  }

  @Test
  @DisplayName("Test findById Success")
  public void testFindById() throws Exception {
    // Setup our mock repository
    SchedulerTask schedulerTask1 = new SchedulerTask(1l, "Scheduler name1", "Scheduler recurrency",
        "Scheduler code");
    doReturn(Optional.of(schedulerTask1)).when(schedulerRepository).findById(1l);
    // Execute the service call
    Optional<SchedulerTaskDTO> schedulerTask = schedulerTaskService.findById(1l);
    // Assert the response
    Assertions.assertTrue(schedulerTask.isPresent(), "Widget was not found");
    Assertions.assertSame(schedulerTask.get().getId(), Optional.of(schedulerTask1).get().getId(),
        "The widget returned was not the same as the mock");
  }

  @Test
  @DisplayName("Test save SchedulerTask")
  public void testSave() {
    // Setup our mock repository
    SchedulerTask schedulerTask = new SchedulerTask(1l, "Scheduler name", "Scheduler recurrency",
        "Scheduler code");
    doReturn(schedulerTask).when(schedulerRepository).save(any());
    SchedulerTaskDTO schedulerTaskDTO = schedulerTaskMapper.entityToDto(schedulerTask);
    // Execute the service call
    Long schedulerTaskId = schedulerTaskService.create(schedulerTaskDTO);
    // Assert the response
    Assertions.assertNotNull(schedulerTask, "The saved widget should not be null");
    Assertions.assertEquals("1", schedulerTaskId.toString(), "The version should be incremented");
  }

  @Test
  @DisplayName("Test delete SchedulerTask")
  public void testDelete() throws CustomNotFoundException {
    Long id = 1L;
    // perform the call
    schedulerTaskService.delete(id);
    // verify the mocks
    verify(schedulerRepository, times(1)).deleteById(eq(id));
  }
}

