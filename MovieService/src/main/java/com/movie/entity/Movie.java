package com.movie.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "movies")
@Data
public class Movie {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String title;
	private String description;
	private String gener;
	private String language;
	private Integer duration;
	private LocalDate releaseDate;
	private String director;
	private Double rating;
	
	
	
}
