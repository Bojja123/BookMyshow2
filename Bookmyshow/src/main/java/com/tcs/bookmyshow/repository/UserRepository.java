package com.tcs.bookmyshow.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tcs.bookmyshow.dto.User;

@Repository
public interface UserRepository extends CrudRepository<User,Long> {


   
}
