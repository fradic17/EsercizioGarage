package garage;

public class Moto extends VeicoloMotore {
	private int tempi;

	public Moto(int id, String marca, int anno, double cilindrata, int tempi) {
		super(id, marca, anno, cilindrata);
		this.tempi = tempi;
	}

	public String toString() {
		return "Marca: " + marca + " anno: " + anno + " cilindrata: " + cilindrata + " tempi: " + tempi;
	}
}
