package garage;

public class Garage {

	private VeicoloMotore[] veicoli;

	public Garage() {
		this.veicoli = new VeicoloMotore[15];
	}

	public void immissioneVeicolo(VeicoloMotore veicolo) {

		int inserito = 0;
		for (int index = 0; index < veicoli.length && inserito != 1; index++) {
			if (veicoli[index] == null) {
				veicoli[index] = veicolo;
				inserito = 1;
			}
		}
	}

	public String ricercaVeicolo(int id) {

		for (int index = 0; index < veicoli.length; index++) {
			if (veicoli[index] != null && id == veicoli[index].getId()) {
				System.out.println(veicoli[index]);
			}
		}
		return null;
	}

	public void situazioneGarage() {

		System.out.println("Situaione garage\n");

		for (int index = 0; index < veicoli.length; index++) {
			if (veicoli[index] != null) {
				System.out.println(veicoli[index]);
			}
		}
	}

	public void eliminaVeicolo(int id) {
		for (int index = 0; index < veicoli.length; index++) {
			if (veicoli[index] != null && id == veicoli[index].getId()) {
				veicoli[index] = null;
				System.out.println("veicolo eliminato");
			}
		}
	}

}
