package com.enotes.entity;

import java.util.Date;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="task")
public class Task {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 
	@Column(name="Id")
	private Long id;
	
	private String title;
	
	private String type;
	
	private Date dueDate;
	
	private String description;
	
}
