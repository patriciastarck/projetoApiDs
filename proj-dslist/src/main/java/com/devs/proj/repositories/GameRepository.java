package com.devs.proj.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devs.proj.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
