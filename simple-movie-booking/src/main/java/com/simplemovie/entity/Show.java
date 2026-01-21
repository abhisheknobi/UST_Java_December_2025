package com.simplemovie.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "movie_show") // 'Show' is a reserved keyword in MySQL, so we rename the table
public class Show {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long showId;
	private LocalDateTime showTime;
	private Integer totalSeats;
	private Integer availableSeats;

	@ManyToOne // Many shows can belong to One movie
	@JoinColumn(name = "movie_id")
	private Movie movie;

	// Getters and Setters
	public Long getShowId() {
		return showId;
	}

	public void setShowId(Long showId) {
		this.showId = showId;
	}

	public LocalDateTime getShowTime() {
		return showTime;
	}

	public void setShowTime(LocalDateTime showTime) {
		this.showTime = showTime;
	}

	public Integer getTotalSeats() {
		return totalSeats;
	}

	public void setTotalSeats(Integer totalSeats) {
		this.totalSeats = totalSeats;
	}

	public Integer getAvailableSeats() {
		return availableSeats;
	}

	public void setAvailableSeats(Integer availableSeats) {
		this.availableSeats = availableSeats;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
}