package com.example.demo;

import java.util.Random;

public class SSPGame {
	private SSPPlayer player1 = new SSPPlayer();
	private SSPPlayer player2 = new SSPPlayer();
	
	public SSPGame() {
		
	}
	
	public void setPlayer1Move(String player1Move) {
		if (player1Move.equals("computer")) {
			this.player1.setSelectMove(randomVal());
		}else this.player1.setSelectMove(player1Move);
	}
public void setPlayer2Move(String player2Move) {
	if (player2Move.equals("Computer")) {
		this.player2.setSelectMove(randomVal());
	}else this.player2.setSelectMove(player2Move);
}
public String getPlayer1Move() {
	return player1.getSelectMove();
}
public String getPlayer2Move() {
	return player2.getSelectMove();
}
public int getPlayer1TotalWins() {
	return player1.getWins();
}
public int getPlayer2TotalWins() {
	return player2.getWins();
}
public int getPlayer1TotalLost() {
	return player1.getLosses();
}
public int getPlayer2TotalLost() {
	return player2.getLosses();
}
public int getPlayer1TotalTies() {
	return player1.getTies();
}
public int getPlayer2TotalTies() {
	return player2.getTies();
}
public String calculateScore() {
	String score = "";
	String winner = "";
	String player1Move = this.player1.getSelectMove();
	String player2Move = this.player2.getSelectMove();
	
	if (player1.getScore()==3 || player2.getScore()==3) {
		player1.resetScore(); player2.resetScore();
	}
	
	switch (player1Move) {
	case "sten":
		switch (player2Move) {
		case "sten":
			score = "tie";
			break;
		case "sax":
			score = "player1";
			break;
		case "papper":
			score = "player2";
			break;
		}
		break;
	case "sax":
		switch(player2Move) {
		case "sten":
			score = "player2";
			break;
		case "sax":
			score = "tie";
			break;
		case "papper":
			score = "player1";
			break;
		}
		break;
		
	case "papper":
		switch (player2Move) {
		case "sten":
			score = "player1";
			break;
		case "sax":
			score = "player2";
			break;
		case "papper":
			score = "tie";
			break;
		}
		break;
		
	}
	if (score.equals("player1")) {
		player1.setScore();
	}else if (score.equals("player2")) {
		player2.setScore();
	}else if (score.equals("tie")) {
		player1.setScore(); player2.setScore();
	}
	if (player1.getScore()==3 && player2.getScore()==3) {
		winner = "tie";
		player1.increaseTies(); player2.increaseTies();
	}else if (player1.getScore()==3) {
		winner = "player1";
		player1.increasewins(); player2.increaseLosses();
		
	}else if (player2.getScore()==3) {
		winner = "player2";
		player2.increasewins(); player1.increaseLosses();
	}else winner = "Ingen";
	
	return "Player1: " + player1.getScore() + "Player2: " + player2.getScore() + "Mästaren är :" + winner;
	
}
	private String randomVal() {
		Random rn = new Random();
		int answer = rn.nextInt(3);
		String returnVal = "";
		
		switch (answer) {
		case 0:
			returnVal = "sten";
			break;
		case 1: returnVal = "sax";
		break;
		case 2:
			returnVal = "papper";
			break;
			default:
				break;
				
		}
		return returnVal;
	}
	
}
