package com.example.demo;

public class SSPPlayer {
	private String selectMove;
	private int wins;
	private int losses;
	private int ties;
	private int score;
	
	public SSPPlayer() {}
	
	public String getSelectMove() {
		return selectMove;
	}
	
	public void setSelectMove(String selectMove) {
		this.selectMove = selectMove;
	}
	public void increasewins() {
		this.wins += 1;
	}
	public int getWins() {
		return wins;
	}
	public void increaseLosses() {
		this.losses +=1;
	}
	public int getLosses() {
		return losses;
	}
	public void increaseTies() {
		this.ties +=1;
	}
	public int getTies() {
		return this.ties; 
	}
	public int getScore() {
		return this.score;
	}
	public void setScore() {
		this.score +=1;
	}
	public void resetScore() {
		this.score = 0;
	}

}
