package com.sessionmanager.repository;

import org.springframework.stereotype.Repository;

import com.sessionmanager.entity.OverallGame;

@Repository
public class GameInMemoryRepo {
	
	//Note: Static - The static variable gets memory only once in the class area at the time of class loading.
	private static final OverallGame OVERALL_GAME = new OverallGame(0);
	
	public int addToTotalRoundsPlayed(int i) {
		OVERALL_GAME.setTotalRoundsPlayed(OVERALL_GAME.getTotalRoundsPlayed() + i);
		return OVERALL_GAME.getTotalRoundsPlayed();
	}
	
	public OverallGame getOverallGameScores() {
		return OVERALL_GAME;
	}
	
	public int getTotalRoundsPlayed() {
		return OVERALL_GAME.getTotalRoundsPlayed();
	}
}
