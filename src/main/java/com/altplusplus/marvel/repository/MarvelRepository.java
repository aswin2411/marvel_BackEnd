package com.altplusplus.marvel.repository;

import com.altplusplus.marvel.model.Avengers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MarvelRepository extends JpaRepository<Avengers, Long> {
}
