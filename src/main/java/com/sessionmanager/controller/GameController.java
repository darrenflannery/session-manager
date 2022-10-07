package com.sessionmanager.controller;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.sessionmanager.dto.GameDto;
import com.sessionmanager.dto.ResponseDto;
import com.sessionmanager.entity.Game;
import com.sessionmanager.entity.OverallGame;
import com.sessionmanager.service.GameService;

@RestController
@RequestMapping("/game")
public class GameController {
	
	@Autowired
	private GameService service;	
	
	@PostMapping("/create")
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<ResponseDto> create(@RequestBody GameDto gameDto) {
		ResponseDto rdto = service.addGameToSession(gameDto);
		return ResponseEntity.ok(rdto);
	}
	
	@RequestMapping("/{sessionId}")
	public ArrayList<Game> findGamesBySessionId(@PathVariable String sessionId) {
		return service.findGamesBySessionId(sessionId);
	}
	
	@RequestMapping("/getAllSessions")
	public HashMap<String, ArrayList<Game>> getAllSessions(){
		return service.getAllSessions();
	}
	
	@RequestMapping("/getOverallGameScores")
	public OverallGame getOverallGameScores(){
		return service.getOverallGameScores();
	}
	
	@RequestMapping("/getTotalRoundsPlayed")
	public int getTotalRoundsPlayed(){
		return service.getTotalRoundsPlayed();
	}

}

