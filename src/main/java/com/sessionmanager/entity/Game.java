package com.sessionmanager.entity;

public class Game {
	
	private String player1Choice;
	private String player2Choice;
	private String result;
	
	public Game() {
	}
	public Game(String player1Choice, String player2Choice, String result) {
		this.player1Choice = player1Choice;
		this.player2Choice = player2Choice;
		this.result = result;
	}
	public String getPlayer1Choice() {
		return player1Choice;
	}
	public void setPlayer1Choice(String player1Choice) {
		this.player1Choice = player1Choice;
	}
	public String getPlayer2Choice() {
		return player2Choice;
	}
	public void setPlayer2Choice(String player2Choice) {
		this.player2Choice = player2Choice;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	} 
	@Override
	public String toString() {
		return "Game [player1Choice=" + player1Choice + ", player2Choice=" + player2Choice + ", result=" + result + "]";
	}
	

}
