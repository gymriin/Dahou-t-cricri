package test_JUnit;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cricri.Dahou�t.utils.Controls;

public class test_isValidMail {

	@Test
	// Ce test n'est valable que pour les conditions �mises par le cahier des charges !!!!
	// L'utilisation du ctlMail avec les expressions r�guli�res verifie compl�tement la validit� d'une adresse mail
	public void test() {
		assertEquals(null, Controls.ctlMail("lionel.duboeuf@gmail.com"));

		assertEquals("il manque @ dans votre adresse mail" ,Controls.ctlMail("lionel.duboeufgmail.com"));

		assertEquals("il manque . dans votre adresse mail" ,Controls.ctlMail("cricri@gmailcom"));
	}

}
