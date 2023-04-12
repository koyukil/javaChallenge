package com.example.demo.repositories;

import com.example.demo.models.userModel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface userRepository extends CrudRepository <userModel, Long> {
    public abstract ArrayList<userModel> findByName(String name);

}
