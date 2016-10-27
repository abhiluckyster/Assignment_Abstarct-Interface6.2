package Music;

public class StringedInstrument extends Instrument {

	int numberOfStrings;
	
	public StringedInstrument(int numberOfStrings, String type) {
		super(type);
		this.numberOfStrings = numberOfStrings;
	}

	public void play(String type) {
		// TODO Auto-generated method stub
		System.out.println("<<<welcome to class stringed Instrument>>>");
		System.out.println("This stringed Instrument has No of strings : " + numberOfStrings);
		
	}

}
