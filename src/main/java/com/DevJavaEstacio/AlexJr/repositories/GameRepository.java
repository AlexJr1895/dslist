package com.DevJavaEstacio.AlexJr.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DevJavaEstacio.AlexJr.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
