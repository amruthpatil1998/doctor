package com.example.Docter.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Docter.modle.Docter;

public interface DocterRepo extends JpaRepository<Docter, Integer> {

}
