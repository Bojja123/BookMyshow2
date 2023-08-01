package com.tcs.bookmyshow.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.bookmyshow.dto.Cinema;
@Repository
public interface CinemaRepository extends CrudRepository<Cinema, Long> {

}
