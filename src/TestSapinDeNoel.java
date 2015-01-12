import static org.junit.Assert.*;

import org.junit.Test;


public class TestSapinDeNoel {

	@Test
	public void testSapinDeNoel() {
		double hauteur = 3.0;
		boolean naturel = true;
		SapinDeNoel spn = new SapinDeNoel(hauteur, naturel);
		assertEquals("hauteur incorrecte", hauteur, spn.getHauteur(), 0);
	//	assertEquals("naturel incorrect", naturel, spn.getnaturel(), 0);
		
		
		
	}

}
