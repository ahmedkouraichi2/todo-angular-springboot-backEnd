package com.enotes.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.enotes.entity.CountType;
import com.enotes.entity.Task;
import com.enotes.repository.TaskRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
  public class TaskServices {
  private TaskRepository taskRepository;
	
	
	public List<Task> getTasks(){
		return taskRepository.getAllTaskDueDateDesc();
	}
	@Transactional
	public Task save(Task task) {
		return taskRepository.saveAndFlush(task);
	}
	public boolean existById(Long id) {
		return taskRepository.existsById(id);
	}

	public Optional<Task> getTaskById(Long id) {
		return taskRepository.findById(id);
	}
	public void delete(Long id) {
		taskRepository.deleteById(id); 
	}
	
	public List<CountType> getPercentageGroupByType() {
		return taskRepository.getPercentageGroupByType();
		
	}
	
}
	
	
	
	

	
	
	
	
	
	
	

	
	
	
	

