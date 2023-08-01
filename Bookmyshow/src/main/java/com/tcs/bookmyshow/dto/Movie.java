package com.tcs.bookmyshow.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name = "MOVIE_TABLE")
@Data
public class Movie {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long movieID;

	@Column(name = "TITTLE")
	private String tittle;

	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "release_DATE", nullable = false)
	private Date releaseDate;
	
	private String moviecycle;

	@OneToOne
	@JoinColumn(name = "screen_id")
	private Screen screen;

	public long getMovieID() {
		return movieID;
	}

	public void setMovieID(long movieID) {
		this.movieID = movieID;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getMoviecycle() {
		return moviecycle;
	}

	public void setMoviecycle(String moviecycle) {
		this.moviecycle = moviecycle;
	}

	public Screen getScreen() {
		return screen;
	}

	public void setScreen(Screen screen) {
		this.screen = screen;
	}

	
	
}
