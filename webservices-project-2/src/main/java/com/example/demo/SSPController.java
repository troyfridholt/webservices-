package com.example.demo;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/RPC")


public class SSPController {
private SSPGame sspGame = new SSPGame();

@RequestMapping(method = RequestMethod.POST)
public String evaluateUserInput(
		String player1Move, String player2Move) {
	if ((!player1Move.equals("sten")&& 
			!player1Move.equals("sax")&&
			!player1Move.equals("papper")&&
			!player1Move.equals("dator"))
			||
			(!player2Move.equals("sten")&&
					!player2Move.equals("sax")&&
					!player2Move.equals("papper")&&
					!player2Move.equals("dator"))
			
			
			
			)
		
	{
		return "Dubbelkolla";
	}
	return "Player1: " + sspGame.getPlayer1Move() + "Player2: " + sspGame.getPlayer2Move() + "Poäng ställning: " + score;
		
}
@RequestMapping(
		method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
public String totalScore() {
	return ObjectJson();
}
private String ObjectJson();{
	return "{"+ "\"Player1\":" + "[{" + "\"Vinster\":" + "\""+ sspGame.getPlayer1TotalWins() + "\""+
"," + "\"Förluster\":" + "\"" + sspGame.getPlayer1TotalLost() + "\""+ 
			"," + "\"Lika\":" + "\"" + sspGame.getPlayer1TotalTies() + "\"" + "}]" + 
"," +
"{"+ "\"Player2:\":" + "[{" + "\"Vinster\":" + "\"" + sspGame.getPlayer2TotalWins() + "\""+
"," + "\"Förluster\":" + "\"" + sspGame.getPlayer2TotalLost() + "\""+ 
			"," + "\"Lika\":" + "\" "+ sspGame.getPlayer2TotalTies() + "\"" + "}]" + "}";
}

}
