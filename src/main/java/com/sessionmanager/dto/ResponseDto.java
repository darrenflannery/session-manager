package com.sessionmanager.dto;

import java.util.ArrayList;

import com.sessionmanager.entity.Game;

public class ResponseDto {
	
	private String sessionId;
	private ArrayList<Game> session;
	
	public ResponseDto(String sessionId, ArrayList<Game> session) {
		this.sessionId = sessionId;
		this.session = session;
	}
	
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public ArrayList<Game> getSession() {
		return session;
	}
	public void setSession(ArrayList<Game> session) {
		this.session = session;
	}
}

