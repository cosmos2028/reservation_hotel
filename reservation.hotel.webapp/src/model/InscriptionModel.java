package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import constante.Constant;
import wshotelmetier.HotelMetierImpl;
import wshotelmetier.HotelMetierImplService;
import wshotelmetier.Profil;

public class InscriptionModel {

	private String resultat;
	private Object utilisateur = null;
	private Map<String, String> erreurs = new HashMap<String, String>();
	private List<Profil> profils = new ArrayList<Profil>();


	HotelMetierImplService service = new HotelMetierImplService();
	HotelMetierImpl proxy = service.getHotelMetierImplPort();

	public String getResultat() {
		return resultat;
	}

	public Map<String, String> getErreurs() {
		return erreurs;
	}

	public Object inscrireUtilisateur(HttpServletRequest request) {

		String nom = getValeurChamp(request, Constant.CHAMP_NOM),
				prenom = getValeurChamp(request, Constant.CHAMP_PRENOM),
				adresse = getValeurChamp(request, Constant.CHAMP_ADRESSE),
				codePostal = getValeurChamp(request, Constant.CHAMP_CODEPOSTAL),
				ville = getValeurChamp(request, Constant.CHAMP_VILLE),
				telephone = getValeurChamp(request, Constant.CHAMP_TELEPHONE),
				email = getValeurChamp(request, Constant.CHAMP_COURRIEL),
				motDePasse = getValeurChamp(request, Constant.CHAMP_MOOTDEPASS),
				confirmation = getValeurChamp(request, Constant.CHAMP_CONF),
				profil = getValeurChamp(request, Constant.CHAMP_profil);

		try {
			validationNom(nom);
		} catch (Exception e) {
			setErreur(Constant.CHAMP_NOM, e.getMessage());
		}
		try {
			validationPrenom(prenom);
		} catch (Exception e) {
			setErreur(Constant.CHAMP_PRENOM, e.getMessage());
		}
		try {
			validationChamp(adresse);
		} catch (Exception e) {
			setErreur(Constant.CHAMP_ADRESSE, e.getMessage());
		}
		try {
			validationChamp(codePostal);
		} catch (Exception e) {
			setErreur(Constant.CHAMP_CODEPOSTAL, e.getMessage());
		}
		try {
			validationChamp(ville);
		} catch (Exception e) {
			setErreur(Constant.CHAMP_VILLE, e.getMessage());
		}
		try {
			validationChamp(telephone);
		} catch (Exception e) {
			setErreur(Constant.CHAMP_TELEPHONE, e.getMessage());
		}
		try {
			validationEmail(email);
		} catch (Exception e) {
			setErreur(Constant.CHAMP_COURRIEL, e.getMessage());
		}
		try {
			validationMotsDePasse(motDePasse, confirmation);
		} catch (Exception e) {
			setErreur(Constant.CHAMP_MOOTDEPASS, e.getMessage());
			setErreur(Constant.CHAMP_CONF, null);
		}
		try {
			validationChamp(profil);
		} catch (Exception e) {
			setErreur(Constant.CHAMP_profil, e.getMessage());
		}
		if (erreurs.isEmpty()) {
			resultat = "Succès de l'inscription.";
			int cp = Integer.parseInt(codePostal);
			utilisateur = proxy.ajouterUtilisateur(nom, prenom, adresse, cp, ville, telephone, email, motDePasse,
					profil);
		} else {
			resultat = "Échec de l'inscription.";
		}

		return utilisateur;
	}

	private void validationEmail(String email) throws Exception {
		if (email != null) {
			if (!email.matches("([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)")) {
				throw new Exception("Merci de saisir une adresse mail valide.");
			}
		} else {
			throw new Exception("Merci de saisir une adresse mail.");
		}
	}

	private void validationMotsDePasse(String motDePasse, String confirmation) throws Exception {
		if (motDePasse != null && confirmation != null) {
			if (!motDePasse.equals(confirmation)) {
				throw new Exception("Les mots de passe entrés sont différents, merci de les saisir à nouveau.");
			} else if (motDePasse.length() < 3) {
				throw new Exception("Les mots de passe doivent contenir au moins 3 caractères.");
			}
		} else {
			throw new Exception("Merci de saisir et confirmer votre mot de passe.");
		}
	}

	private void validationChamp(String champ) throws Exception {
		if (champ.equals(null) || champ.isEmpty()) {
			throw new Exception("Le" + champ + " doit etre renseigné.");
		}
	}

	private void validationNom(String nom) throws Exception {
		if (nom.equals(null) || nom.length() < 3) {
			throw new Exception("Le nom d'utilisateur doit contenir au moins 3 caractères.");
		}
	}

	private void validationPrenom(String prenom) throws Exception {
		if (prenom.equals(null) || prenom.length() < 3) {
			throw new Exception("Le prenom d'utilisateur doit contenir au moins 3 caractères.");
		}
	}

	/*
	 * Ajoute un message correspondant au champ spécifié à la map des erreurs.
	 */
	private void setErreur(String champ, String message) {
		erreurs.put(champ, message);
	}

	/*
	 * Méthode utilitaire qui retourne null si un champ est vide, et son contenu
	 * sinon.
	 */
	private  String getValeurChamp(HttpServletRequest request, String nomChamp) {
		String valeur = request.getParameter(nomChamp);
		if (valeur == null || valeur.trim().length() == 0) {
			return null;
		} else {
			return valeur.trim();
		}
	}
	
	public List<wshotelmetier.Profil> getProfils() {
		return proxy.consulterProfils();
	}

	public void setProfils(List<wshotelmetier.Profil> profils) {
		this.profils = profils;
	}
}

// response.setContentType("text/html");
// PrintWriter out = response.getWriter();
// out.println("<h1>TestServlet</h1>");
// HotelCRUD proxy = service.getHotelCRUDPort();
// out.println("proxy=" + proxy + "<br>");
// Hotel hotel = proxy.getHotel(1);
// out.print("Hotel " + hotel.getNomHotel() + " " + hotel.getAdresse()+ "<br>");
// Collection<Hotel> hotels = proxy.getHotels();
// for(Hotel h : hotels) {
// out.print("p " + h.getCodeHotel() + " " + h.getNomHotel() + " " +
// h.getAdresse() + "<br>");
// }
// proxy.createHotel("accorHotel", "54 Bd de rue 875214");
// proxy.deleteHotel(5);
// proxy.updateHotel(4, "hello", "29 rue dolatela");
// out.println("transactions JTA terminées");
