package Music;

public class ElectricGuitar extends StringedInstrument{
	
public ElectricGuitar(int numberOfStrings, String type) {
		super(numberOfStrings, type);
		// TODO Auto-generated constructor stub
	}
	

	public void play()
	{
		super.play(type);
		System.out.println("This Class is electric guitar !!!" );
	}

}
