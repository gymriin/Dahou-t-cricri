package com.cricri.Dahouët.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.cricri.Dahouët.metiers.Commissaire;
import com.cricri.Dahouët.metiers.Licencie;
import com.cricri.Dahouët.metiers.Personne;
import com.cricri.Dahouët.metiers.Proprietaire;

public class Affiche {
	
	public static void AffichLicencie (){
		SimpleDateFormat datnais = new SimpleDateFormat("yyyy/MM/dd");
		String birthday="1975/09/25";
		
		
		Licencie l=null;
		try {
			l = new Licencie("Crapaud", "Nanard@letetard.net", "Bernard", 1580, 230.8, datnais.parse(birthday), 2015);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String mess = l.toString();
		System.out.print(mess);
		
	}
	public static void AffichPropr (){
		Proprietaire p=new Proprietaire("Le Bonobo","MaxLaPoisse@Gmail.com", "Max", "07.07.07.07","29 avenue de la Loose, 33000 Bordeaux");
		String mess = p.toString();
		System.out.print(mess);
	}
	public static void AffichCom(){
		Commissaire c=new Commissaire("Ducon","stpénible@kikou.net","Michel", "Bretagne");
		String mess = c.toString();
		System.out.print(mess);
	}
	public static void AffichePers(){
		Personne pers=new Personne("Legrand","Joël@Legrand.com","Joël");
		String mess = pers.toString();
		System.out.print(mess);
	}
}

