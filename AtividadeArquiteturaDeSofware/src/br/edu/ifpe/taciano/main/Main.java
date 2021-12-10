package br.edu.ifpe.taciano.main;

import br.edu.ifpe.taciano.facade.GameFacade;

public class Main {

	public static void main(String[] args) {
		GameFacade gameFacade = new GameFacade();
		
		gameFacade.createCharacters();
		
		gameFacade.createSkills();
		
		gameFacade.executeCharActions();
	}
}
