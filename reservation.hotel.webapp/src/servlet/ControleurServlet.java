package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.InscriptionModel;

//@WebServlet("/MaServlet")
public class ControleurServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int positionDernierSlash, positionDernierPoint;
	String action = "aucune", vue = null;
	// public static final String ATT_USER = "utilisateur";
	public static final String ATT_USER = "utilisateur";
	public static final String ATT_INSCRIRE = "inscriptionModel";

	/**
	 * elle s'exécute une fois que l'objet est chargé en mémoire(on aura q'une
	 * seule instance de cette objet)
	 */
	@Override
	public void init() throws ServletException {
		// service = new HotelCRUDService();
		super.init();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// Aiguillage sur la vue
		vue = cheminVue(request);

		getServletContext().getRequestDispatcher(vue).forward(request, response);

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/* Préparation de l'objet inscription */
		InscriptionModel inscriptionModel = new InscriptionModel();

		/*
		 * Appel au traitement et à la validation de la requête, et récupération
		 * d'untilsateur(client ou indépendant) en résultant
		 */
		Object utilisateur = inscriptionModel.inscrireUtilisateur(request);

		/* Stockage du bean dans l'objet request */
		request.setAttribute(ATT_USER, utilisateur);
		request.setAttribute(ATT_INSCRIRE, inscriptionModel);

		// Aiguillage sur la vue
		vue = cheminVue(request);
		this.getServletContext().getRequestDispatcher(vue).forward(request, response);
	}

	private String cheminVue(HttpServletRequest request) {

		/**
		 * récupération de l'url
		 */
		String url = request.getRequestURI();

		/**
		 * 
		 * exemple url http://localhost:8080/reservation.hotel.webapp/monUrl.GLM
		 * ici on récuper la position du dernier slash et celle du dernier point
		 * 
		 */
		positionDernierSlash = url.lastIndexOf('/');
		positionDernierPoint = url.lastIndexOf('.');

		if (positionDernierPoint > positionDernierSlash && positionDernierPoint >= 0) {
			action = url.substring(positionDernierSlash + 1, positionDernierPoint);
		}

		/**
		 * effectuer un mapping entre la vue et le traitement
		 */
		switch (action) {
		case "VueHotel":
			vue = "/views/VueHotel.jsp";
			break;

		default:
			vue = "/views/VueHotel.jsp";
			break;
		}
		return vue;
	}

}
