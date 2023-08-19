package net.hackspace.behavioural.memento.videoGamePlayer;

public class Memento {
	private GamePlayer player;

	public Memento(GamePlayer player) {
		super();
		this.player = player;
	}
	
	GamePlayer getPlayerSnapShot(){
		return player;
	}

}