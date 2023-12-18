package com.shivamsharma01.backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.shivamsharma01.backend.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
