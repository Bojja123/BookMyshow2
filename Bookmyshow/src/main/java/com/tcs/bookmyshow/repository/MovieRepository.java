package com.tcs.bookmyshow.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.bookmyshow.dto.Movie;
@Repository
public interface MovieRepository extends CrudRepository<Movie, Long> {

}
