package com.devs.proj.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devs.proj.dto.GameMinDto;
import com.devs.proj.entities.Game;
import com.devs.proj.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;

	public List<GameMinDto> findAll() {
	    List<Game> result = gameRepository.findAll();
	    List<GameMinDto> dto = result.stream()
	                                  .map(x -> new GameMinDto(x))
	                                  .collect(Collectors.toList());
	    return dto;
	}

	
}
		
