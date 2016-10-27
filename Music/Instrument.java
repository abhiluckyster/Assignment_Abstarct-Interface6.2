package Music;

public abstract class Instrument {

	String type;
	public Instrument(String type2) {
		// TODO Auto-generated constructor stub
		type=type2;
	}
	public abstract void play(String type);
	
	
}
