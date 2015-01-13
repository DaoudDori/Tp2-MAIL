import static org.junit.Assert.*;

import org.junit.Test;


public class TestGuirlande {

	@Test
	public void testGuirlande()
	{
		String couleur = "jaune";
		Guirlande g = new Guirlande(couleur);
		assertEquals("d", g.getCouleur(),  "jaune");
		
	}

}
