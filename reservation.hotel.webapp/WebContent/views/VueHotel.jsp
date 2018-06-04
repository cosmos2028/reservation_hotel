<%@ page pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Inscription</title>
        <link type="text/css" rel="stylesheet" href="inscriptionModel.css" />
    </head>
    <body>
        <form method="post" action="/reservation.hotel.webapp/ControleurServlet">
            <fieldset>
                <legend>Inscription</legend>
                <p>Vous pouvez vous inscrire via ce inscriptionModelulaire.</p>

				<label for="nom">Nom d'utilisateur</label>
                <input type="text" id="nom" name="nom" value="<c:out value="${utilisateur.Nom}"/>" size="20" maxlength="20" />
                <span class="erreur">${inscriptionModel.erreurs['nom']}</span>
                <br />
                <label for="nom">Prenom d'utilisateur</label>
                <input type="text" id="prenom" name="prenom" value="<c:out value="${utilisateur.Prenom}"/>" size="20" maxlength="20" />
                <span class="erreur">${inscriptionModel.erreurs['prenom']}</span>
                <br />
                <label for="adresse">Adresse d'utilisateur</label>
                <input type="text" id="adresse" name="adresse" value="<c:out value="${utilisateur.Adresse}"/>" size="20" maxlength="20" />
                <span class="erreur">${inscriptionModel.erreurs['adresse']}</span>
                <br />
                <label for="codePostal">code postal d'utilisateur</label>
                <input type="text" id="codePostal" name="codePostal" value="<c:out value="${utilisateur.CodePostal}"/>" size="20" maxlength="20" />
                <span class="erreur">${inscriptionModel.erreurs['codePostal']}</span>
                <br />
                <label for="ville">ville d'utilisateur</label>
                <input type="text" id="ville" name="ville" value="<c:out value="${utilisateur.Ville}"/>" size="20" maxlength="20" />
                <span class="erreur">${inscriptionModel.erreurs['ville']}</span>
                <br />
                <label for="telephone">telephone d'utilisateur</label>
                <input type="text" id="telephone" name="telephone" value="<c:out value="${utilisateur.telephone}"/>" size="20" maxlength="20" />
                <span class="erreur">${inscriptionModel.erreurs['telephone']}</span>
                <br />
                
                <label for="courriel">Adresse email <span class="requis">*</span></label>
                <input type="email" id="courriel" name="courriel" value="<c:out value="${utilisateur.Courriel}"/>" size="20" maxlength="60" />
                <span class="erreur">${inscriptionModel.erreurs['courriel']}</span>
                <br />

                <label for="motDePass">Mot de passe <span class="requis">*</span></label>
                <input type="password" id="motDePass" name="motDePass" value="" size="20" maxlength="20" />
                <span class="erreur">${inscriptionModel.erreurs['motDePass']}</span>
                <br />

                <label for="confirmation">Confirmation du mot de passe <span class="requis">*</span></label>
                <input type="password" id="confirmation" name="confirmation" value="" size="20" maxlength="20" />
                <span class="erreur">${inscriptionModel.erreurs['confirmation']}</span>
                <br />

                <label for="nom">Profil d'utilisateur</label>
                
                 <select id="profil" name="profil">   
            <c:forEach items="${inscriptionModel.profils}" var="p">
             <option value="<c:out value='${p.nom}'/>"> <c:out value='${p.nom}'/>   </option>
            </c:forEach>  
          </select>  

                <input type="submit" value="Inscription" class="sansLabel" />
                <br />
                
                <p class="${empty inscriptionModel.erreurs ? 'succes' : 'erreur'}">${inscriptionModel.resultat}</p>
            </fieldset>
        </form>
    </body>
</html>