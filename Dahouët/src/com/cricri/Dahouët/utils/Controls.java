package com.cricri.Dahou�t.utils;

public class Controls {

	public static String ctlMail(String mail) {
		// Voici le test de l'adresse mail avec expressions r�guli�res

		// if
		// (mail.matches("^[a-zA-Z0-9._-]{2,}+@[a-zA-Z0-9._-]{2,}\\.[a-z]{2,4}$"))
		// {
		// }
		// { System.out.print("Adresse mail invalide"); }
		//

		String errorMess = null;
		boolean test = true;

		if (mail.contains("@")) {
			test = true;
		} else {
			test = false;
			errorMess = "il manque @ dans votre adresse mail";
			return errorMess;
		}
		if (mail.contains(".")) {
			test = true;
		} else {
			test = false;
			errorMess = "il manque . dans votre adresse mail";
			return errorMess;
		}

		if (((mail.indexOf('@')) > 3)) {
			test = true;
		} else {
			test = false;
			errorMess = "Vous avez moins de 2 caract�res avant votre @ ";
			return errorMess;
		}
		if ((mail.lastIndexOf('.')) - (mail.indexOf('@')) >= 3) {
			test = true;
		} else {
			test = false;
			errorMess = "Vous avez moins de 2 caract�res entre votre @ et votre point";
			return errorMess;
		}
		if (((mail.length()) - (mail.lastIndexOf('.'))) >= 3) {
			test = true;
		} else {
			test = false;
			errorMess = "Vous avez moins de 2 caract�res apr�s votre . ";
			return errorMess;
		}
		return errorMess;
	}

}
