package com.tcs.bookmyshow.dto;

public class MovieDto {

	
	private String tittle;
	private String releaseDate;
	private String moviecycle;
	
	
	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getMoviecycle() {
		return moviecycle;
	}

	public void setMoviecycle(String moviecycle) {
		this.moviecycle = moviecycle;
	}

	@Override
	public String toString() {
		return "MovieDto [tittle=" + tittle + ", releaseDate=" + releaseDate + "]";
	}

}
