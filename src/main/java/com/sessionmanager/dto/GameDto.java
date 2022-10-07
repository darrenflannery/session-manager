package com.sessionmanager.dto;

import com.sessionmanager.entity.Game;

public class GameDto {

	private String sessionId;
	//private Game game;
	private String player1Choice;
	private String player2Choice;
	private String result;
	
	public String getSessionId() {
		return sessionId;
	}
	public String getPlayer1Choice() {
		return player1Choice;
	}
	public String getPlayer2Choice() {
		return player2Choice;
	}
	public String getResult() {
		return result;
	}

}
