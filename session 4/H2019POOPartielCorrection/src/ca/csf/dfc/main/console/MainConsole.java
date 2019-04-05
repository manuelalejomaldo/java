package ca.csf.dfc.main.console;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import ca.csf.dfc.reservation.*;

public class MainConsole {

	public static void main(String[] args) {
		ReservationRepository rr = new DonneesTestReservationRepository();
		ReservationServices rs = new ReservationServices(rr);
		
		// rs.reserverRessource(p_identifiantRessource, p_date);
		System.out.println(new Laboratoire(123, "P-109").estDuType("Laboratoire"));
		System.out.println(new Laboratoire(123, "P-109").estDuType("laboratoire"));
		System.out.println(new Laboratoire(123, "P-109").estDuType("salle"));
		
		System.out.println();
		
		System.out.println(rr.trouverRessourcesParType("Laboratoire"));
		System.out.println(rr.trouverRessourcesParType("Projecteur"));
		System.out.println(rr.trouverRessourcesParType("autre"));
		
		System.out.println();
		System.out.println("Avant réservation");
		LocalDate dateDuJour = LocalDate.now();
		rs.afficherRessoucesDisponibles(dateDuJour);
		
		// On va réserver deux ressources au hasard
		List<Ressource> ressourcesDisponibles = rs.obtenirRessourcesDisponibles(dateDuJour);
		Collections.shuffle(ressourcesDisponibles);
		Ressource res1 = ressourcesDisponibles.get(0);
		Ressource res2 = ressourcesDisponibles.get(1);
		System.out.println();
		System.out.println("Réservation des ressources: ");
		System.out.println(res1);
		System.out.println(res2);
		rs.reserverRessource(res1, dateDuJour);
		rs.reserverRessource(res2, dateDuJour);
		
		System.out.println();
		System.out.println("Après réservation");
		rs.afficherRessoucesDisponibles(LocalDate.of(2019, 3, 4));
	}

}
