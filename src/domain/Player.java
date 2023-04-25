package domain;

public class Player {
	
	private String name;
	private boolean winner;
	private String simbol;
	private boolean turns;
	
	public Player() {
		
	}

	public Player(String name, boolean winner, String simbol, boolean turns) {
		super();
		this.name = name;
		this.winner = winner;
		this.simbol = simbol;
		this.turns = turns;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isWinner() {
		return winner;
	}

	public void setWinner(boolean winner) {
		this.winner = winner;
	}

	public String getSimbol() {
		return simbol;
	}

	public void setSimbol(String simbol) {
		this.simbol = simbol;
	}

	public boolean isTurns() {
		return turns;
	}

	public void setTurns(boolean turns) {
		this.turns = turns;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + ", winner=" + winner + ", simbol=" + simbol + ", turns=" + turns + "]";
	}
	
	

}
