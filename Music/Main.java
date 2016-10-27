package Music;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ElectricGuitar eg= new ElectricGuitar(4, "stringed instrument");
		eg.play();
		ElectricBassGuitar ebg=new ElectricBassGuitar(6,"stringed instrument");
		ebg.play();
	}

}
