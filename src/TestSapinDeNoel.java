import static org.junit.Assert.*;

import org.junit.Test;


public class TestSapinDeNoel {

	@Test
	public void testSapinDeNoel() {
		double hauteur = 3.0;
		boolean naturel = true;
		SapinDeNoel spn = new SapinDeNoel(hauteur, naturel);
		assertEquals("Hauteur incorrecte", hauteur, spn.getHauteur(), 0);
		assertEquals("Le sapin n'est pas naturel", naturel, spn.getnaturel());

	}

	@Test
	public void testFairePousser()
	{
		double x = 1.5;
		SapinDeNoel spn = new SapinDeNoel(3.0, true);
		spn.faire_pousser(x);
		assertEquals("d", spn.getHauteur(),  (x + 3.0), 0);
		
	}
	
	
	@Test
	public void testFairePousser2()
	{
		double x = 1.5;
		SapinDeNoel spn = new SapinDeNoel(3.0, false);
		spn.faire_pousser(x);
		assertEquals("d", spn.getHauteur(),  3.0, 0);
		
	}
	
	
	
	@Test
	public void testAddGuirlande()
	{
		Guirlande g = new Guirlande("jaune");
		SapinDeNoel spn = new SapinDeNoel(3.0, true);
		spn.addGuirlandes(g);
		assertEquals("d",g, spn.getListe_de_guirlandes().get(0));
		
	}
	
	@Test
	public void testretirerGuirlande()
	{
		Guirlande guirlandeJaune = new Guirlande("jaune");
		Guirlande guirlandeBleue = new Guirlande("bleue");
		SapinDeNoel spn = new SapinDeNoel(3.0, true);
		spn.addGuirlandes(guirlandeBleue);
		spn.addGuirlandes(guirlandeJaune);
		int size = spn.getListe_de_guirlandes().size();
		spn.retirerGuirlandes();
		int newSize = spn.getListe_de_guirlandes().size();
		assertEquals("d",20, (size-1));
		
	}
	
	
	
}
