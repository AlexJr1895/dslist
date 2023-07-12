package com.DevJavaEstacio.AlexJr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.DevJavaEstacio.AlexJr.dto.GameMinDTO;
import com.DevJavaEstacio.AlexJr.entities.Game;
import com.DevJavaEstacio.AlexJr.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
		
		return dto;
		
	}
}
