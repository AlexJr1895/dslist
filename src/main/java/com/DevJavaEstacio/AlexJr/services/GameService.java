package com.DevJavaEstacio.AlexJr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DevJavaEstacio.AlexJr.dto.GameDTO;
import com.DevJavaEstacio.AlexJr.dto.GameMinDTO;
import com.DevJavaEstacio.AlexJr.entities.Game;
import com.DevJavaEstacio.AlexJr.projections.GameMinProjection;
import com.DevJavaEstacio.AlexJr.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		return new GameDTO(result);
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long ListId) {
		List<GameMinProjection> result = gameRepository.searchByList(ListId);
		return result.stream().map(x -> new GameMinDTO(x)).toList();
	}
}
