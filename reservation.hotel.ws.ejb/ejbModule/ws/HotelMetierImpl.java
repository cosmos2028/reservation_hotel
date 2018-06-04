package ws;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.jws.WebService;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entity.Chambre;
import entity.Client;
import entity.Hotel;
import entity.Independant;
import entity.Profil;
@WebService
@Stateless
public class HotelMetierImpl implements IHotelMetier {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	public List<Hotel> consulterHotelsRegion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Chambre> consulterChambresHotel(String nom_hotel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Chambre> consulterChambresParServices(List<String> services) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Chambre> consulterChambresParCriteres(Map<String, String> criteres) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Chambre> consulterChambresParIntervallePrix(int prixMin, int prixMax) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Chambre> consulterChambresParVilleOuParCodeDepartement(String villeoucodeDept) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Chambre> consulterChambresParAdresse(String adresse) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Chambre> consulterChambresEnchere() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<Profil> consulterProfils() {
		
		Query query = entityManager.createQuery("from Profil");
		return query.getResultList();
	}

	@Override
	public Object ajouterUtilisateur(String nom, String prenom, String adresse, int codePostal, String ville,
			String telephone, String courriel,String motDePass, String profil) {
		Object utilisateur = null;
		if (nom !=null && prenom !=null && adresse !=null && codePostal !=0 && ville !=null && telephone !=null && courriel !=null && profil !=null && motDePass!=null) {
			
			if (profil.equals("client")) {
				Client client = new Client();
				client.setNom(nom);
				client.setPrenom(prenom);
				client.setAdresse(adresse);
				client.setCodePostal(codePostal);
				client.setVille(ville);
				client.setTelephone(telephone);
				client.setCourriel(courriel);
				client.setMotDePass(motDePass);
				entityManager.persist(client);
				utilisateur = client;
			}else if(profil.equals("independant")){
				Independant independant = new Independant();
				independant.setNom(nom);
				independant.setPrenom(prenom);
				independant.setAdresse(adresse);
				independant.setCodePostal(codePostal);
				independant.setVille(ville);
				independant.setTelephone(telephone);
				independant.setCourriel(courriel);
				independant.setMotDePass(motDePass);
				entityManager.persist(independant);
				utilisateur = independant;
			}
		}
		return utilisateur;
	}

	@Override
	public Object authentificationParProfil(int identifiant, String motDePass) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimerCompteUtilisateur(int identifiant) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reservationChambre(int id_client, int id_independant, Date dateReserv) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void annulerReservation(int id_reservation) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void commenterHoter(int id_client, int code_hotel, String commentaire, int noteChiffreEtoile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clientParticipeAuxEnchere(int id_client, int id_publication, Double prix_propose) {
		// TODO Auto-generated method stub
		
	}


}
