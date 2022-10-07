package com.sessionmanager.repository;

import org.springframework.stereotype.Repository;

import com.sessionmanager.entity.OverallGame;

@Repository
public class GameInMemoryRepo {
	
	private OverallGame overallGame = new OverallGame();
	
	public int addToTotalRoundsPlayed(int i) {
		overallGame.setTotalRoundsPlayed(overallGame.getTotalRoundsPlayed() + i);
		return overallGame.getTotalRoundsPlayed();
	}
}
