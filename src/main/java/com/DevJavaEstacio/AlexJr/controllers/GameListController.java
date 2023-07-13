package com.DevJavaEstacio.AlexJr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.DevJavaEstacio.AlexJr.dto.GameListDTO;
import com.DevJavaEstacio.AlexJr.dto.GameMinDTO;
import com.DevJavaEstacio.AlexJr.services.GameListService;
import com.DevJavaEstacio.AlexJr.services.GameService;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {
	
	@Autowired
	private GameListService gameListService; 
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> result = gameListService.findAll();
		return result;
	}
	
	@GetMapping(value = "/{ListId}/games")
	public List<GameMinDTO> findByList(@PathVariable Long ListId){
		List<GameMinDTO> result = gameService.findByList(ListId);
		return result;
	}
}
