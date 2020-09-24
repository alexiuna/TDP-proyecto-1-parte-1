package proyecto1TDPparte1;

public class Galletita {
	private String forma;
	private String sabor;
	
	public Galletita (String formita, String saborElegido) {
		forma=formita;
		sabor=saborElegido;
	}
	
	public String getFormaSolicitada() {
		return forma;
	}
	
	public String getSabor() {
		return sabor;
	}
}
