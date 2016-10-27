package Music;

public class ElectricBassGuitar extends StringedInstrument{
	
	public ElectricBassGuitar(int numberOfStrings, String type) {
		super(numberOfStrings, type);
		// TODO Auto-generated constructor stub
	}

	public void play()
	{
		super.play(type);
		System.out.println("This class is electric bass guitar $$$");
	}

}
