package garage;

public class Auto extends VeicoloMotore {
	private int porte;
	private String alimentazione;

	public Auto(int id, String marca, int anno, double cilindrata, int porte, String alimentazione) {
		super(id, marca, anno, cilindrata);
		this.porte = porte;
		this.alimentazione = alimentazione;
	}

	public String toString() {
		return "Marca: " + marca + " anno: " + anno + " cilindrata: " + cilindrata + " porte: " + porte
				+ " alimentazione: " + alimentazione;
	}
}
