package ws;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import entity.*;

public interface IHotelMetier {

	public List<Hotel> consulterHotelsRegion();
	public List<Chambre> consulterChambresHotel(String nom_hotel);
	public List<Chambre> consulterChambresParServices(List<String> services);
	public List<Chambre> consulterChambresParCriteres(Map<String,String> criteres);
	public List<Chambre> consulterChambresParIntervallePrix(int prixMin,int prixMax);
	public List<Chambre> consulterChambresParVilleOuParCodeDepartement(String villeoucodeDept);
	public List<Chambre> consulterChambresParAdresse(String adresse);
	public List<Chambre> consulterChambresEnchere();
	public List<Profil>  consulterProfils();
	
	//je peux retourner soit un indépendant ou un client
	public Object ajouterUtilisateur(String nom,String prenom,String adresse,int codePostal,String ville,String telephone,String courriel,String motDePass,String profil);
	public Object authentificationParProfil(int identifiant,String motDePass);
	public void supprimerCompteUtilisateur(int identifiant);
	public void reservationChambre(int id_client,int id_independant,Date dateReserv);
	public void annulerReservation(int id_reservation);
	public void commenterHoter(int id_client,int code_hotel,String commentaire,int noteChiffreEtoile);
	public void clientParticipeAuxEnchere(int id_client,int id_publication,Double prix_propose);
	


}
