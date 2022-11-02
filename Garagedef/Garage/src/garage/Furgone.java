package garage;

public class Furgone extends VeicoloMotore {
	private double capacita;

	public Furgone(int id, String marca, int anno, double cilindrata, double capacita) {
		super(id, marca, anno, cilindrata);
		this.capacita = capacita;
	}

	public String toString() {
		return "Marca: " + marca + " anno: " + anno + " cilindrata: " + cilindrata + " capacità: " + capacita;
	}

}
