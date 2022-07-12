package com.project.shortenedurl.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Url {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String shorturl;
	private String originalurl;

}
