package garage;

import java.util.Scanner;

public class GestioneGarage {

	public static Garage garage = new Garage();

	public static void main(String args[]) {

		creaVeicolo();
		estrazioneVeicolo();
		garage.situazioneGarage();

	}

	private static void creaVeicolo() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);

		int id = 0;
		char scelta, scelta2;
		do {
			System.out.print("Vuoi inserire un auto(a), una moto(m) o un furgone(f): ");
			scelta = scanner.next().charAt(0);

			switch (scelta) {
			case 'a': {
				System.out.print("Inserisci marca: ");
				String marca = scanner2.nextLine();
				System.out.print("Inserisci anno: ");
				int anno = scanner.nextInt();
				System.out.print("Inserisci cilindrata: ");
				double cilindrata = scanner.nextDouble();
				System.out.print("Numero porte: ");
				int porte = scanner.nextInt();
				System.out.print("Diesel o benzina: ");
				String db = scanner2.nextLine();
				Auto auto = new Auto(id, marca, anno, cilindrata, porte, db);
				garage.immissioneVeicolo(auto);
			}
				break;
			case 'm': {
				System.out.print("Inserisci marca: ");
				String marca = scanner2.nextLine();
				System.out.print("Inserisci anno: ");
				int anno = scanner.nextInt();
				System.out.print("Inserisci cilindrata: ");
				double cilindrata = scanner.nextDouble();
				System.out.print("Inserisci tempi: ");
				int tempi = scanner.nextInt();
				Moto moto = new Moto(id, marca, anno, cilindrata, tempi);
				garage.immissioneVeicolo(moto);
			}
				break;
			case 'f': {
				System.out.print("Inserisci marca: ");
				String marca = scanner2.nextLine();
				System.out.print("Inserisci anno: ");
				int anno = scanner.nextInt();
				System.out.print("Inserisci cilindrata: ");
				double cilindrata = scanner.nextDouble();
				System.out.print("Inserisci capacità: ");
				double capacita = scanner.nextDouble();
				Furgone furgone = new Furgone(id, marca, anno, cilindrata, capacita);
				garage.immissioneVeicolo(furgone);
			}
				break;
			default:
				System.out.println("Non è possibile inserire il veicolo indicato!");
			}
			id++;

			System.out.print("..............\n");

			System.out.print("Vuoi continuare con l'inserimento? (s/n): ");
			scelta2 = scanner.next().charAt(0);

			System.out.print("..............\n");

		} while (scelta2 != 'n' && id < 14);
		if (id == 14 && scelta2 == 's') {
			System.out.print("Non ci sono più posti disponibili \n");
			System.out.print("..............\n");
		}
	}

	private static void estrazioneVeicolo() {

		Scanner scanner3 = new Scanner(System.in);

		System.out.print("Inserisci indice veicolo da cercare:");
		int cerca = scanner3.nextInt();
		garage.ricercaVeicolo(cerca);

		System.out.print("Desideri eliminarlo (s/n):");
		char risposta = scanner3.next().charAt(0);

		if (risposta == 's')
		garage.eliminaVeicolo(cerca);

		System.out.print("..............\n");

	}

}
