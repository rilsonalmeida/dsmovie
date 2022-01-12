package com.pulsartrends.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pulsartrends.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
