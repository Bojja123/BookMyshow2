package com.tcs.bookmyshow.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.bookmyshow.dto.Screen;

@Repository
public interface ScreenRepository extends CrudRepository<Screen, Long> {

}
