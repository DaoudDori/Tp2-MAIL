public class Guirlande
{
    // instance variables - replace the example below with your own
    private String couleur;

    
    public Guirlande(String couleur)
    {
        this.couleur = couleur;
    }
    
    public void afficher()
    {
        System.out.println("La guirlande est de couleur " + this.couleur);
    }

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
    
    
   
}
