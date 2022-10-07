package com.sessionmanager.entity;

public class OverallGame {
	
	private int totalRoundsPlayed;

	public OverallGame(int totalRoundsPlayed) {
		this.totalRoundsPlayed = totalRoundsPlayed;
	}

	public int getTotalRoundsPlayed() {
		return totalRoundsPlayed;
	}

	public void setTotalRoundsPlayed(int totalRoundsPlayed) {
		this.totalRoundsPlayed = totalRoundsPlayed;
	}
}
