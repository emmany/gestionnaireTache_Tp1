package Tp1;

import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitrecherchetache {

	@Test
	public void test() {
		PrincipaleMain test = new  PrincipaleMain();
		Tache retour = test.recherche_tache("Analyse");
	}

}
