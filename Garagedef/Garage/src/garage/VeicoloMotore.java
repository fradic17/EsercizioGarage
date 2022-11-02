package garage;

public abstract class VeicoloMotore {

	protected int id;
	protected String marca;
	protected int anno;
	protected double cilindrata;

	protected VeicoloMotore(int id, String marca, int anno, double cilindrata) {
		this.id = id;
		this.marca = marca;
		this.anno = anno;
		this.cilindrata = cilindrata;
	}

	protected int getId() {
		return id;
	}

	protected void setId(int id) {
		this.id = id;
	}

}
