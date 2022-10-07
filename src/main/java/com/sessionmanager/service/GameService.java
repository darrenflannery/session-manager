package com.sessionmanager.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sessionmanager.dto.GameDto;
import com.sessionmanager.dto.ResponseDto;
import com.sessionmanager.entity.Game;
import com.sessionmanager.entity.OverallGame;
import com.sessionmanager.repository.GameInMemoryRepo;
import com.sessionmanager.session.SessionInMemoryRegistry;

@Service("gameService")
public class GameService {
	
	@Autowired
	private SessionInMemoryRegistry sessionRegistry;
	
	@Autowired
	private GameInMemoryRepo repo;

	public ResponseDto addGameToSession(GameDto gameDto) {
		repo.addToTotalRoundsPlayed(1);
		return sessionRegistry.addGameSession(gameDto.getSessionId(), gameDto.getPlayer1Choice(), gameDto.getPlayer2Choice(), gameDto.getResult());
	}
	
	public ArrayList<Game> findGamesBySessionId(String sesssionId){
		return sessionRegistry.findGamesBySessionId(sesssionId);
	}
	
	public HashMap<String, ArrayList<Game>> getAllSessions(){
		return sessionRegistry.getAllSessions();
	}
	
	public OverallGame getOverallGameScores(){
		return repo.getOverallGameScores();
	}
	
	public int getTotalRoundsPlayed(){
		return repo.getTotalRoundsPlayed();
	}
}
