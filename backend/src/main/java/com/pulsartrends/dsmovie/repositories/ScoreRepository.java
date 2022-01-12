package com.pulsartrends.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pulsartrends.dsmovie.entities.Score;
import com.pulsartrends.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}
