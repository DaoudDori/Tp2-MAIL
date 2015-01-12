
import java.util.ArrayList;

public class SapinDeNoel
{
    // instance variables - replace the example below with your own
    private double hauteur;
    private boolean naturel;
    
    
    private ArrayList<Guirlande> liste_de_guirlandes = new ArrayList<Guirlande>();

      
    public void addGuirlandes(Guirlande g)
    {
        this.liste_de_guirlandes.add(g);
    }
    
    
    
    
     public void afficher()
    {
        System.out.println("Votre sapin fait " + this.hauteur);
        if(naturel) System.out.println("C'est un véritable sapin");
        else System.out.println("C'est un sapin artificiel");
        
        for(int i=0; i<liste_de_guirlandes.size(); i++)
        {
            liste_de_guirlandes.get(i).afficher();
        }
        
        
    }
    
    

    /**
     * Constructor for objects of class SapinDeNoel
     */
    // double hauteur, boolean naturel, String couleur
    public SapinDeNoel(double hauteur, boolean naturel)
    {
        this.hauteur = hauteur;
        this.naturel = naturel;

    }
    
    
    
    
    
       
    public void faire_pousser(double x)
    {
        if(naturel)
        {
         double nouvelleHauteur = this.hauteur + x;
         this.setHauteur(nouvelleHauteur);
         System.out.println("Votre sapin fait desormais " + (this.hauteur));
        }
        
        else
        {
         System.out.println("Votre sapin ne peut grandir car il n'est pas naturel !!");
        }
        
    }
  
    
    

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void test()
    {
        System.out.println("Vous venez de creer un Sapin de noel : " + this);
    }
    
    public double getHauteur()
    {
        return this.hauteur;
    }
    
    public boolean getnaturel()
    {
        return this.naturel;
    }
    
    public void setHauteur(double h)
    {
        this.hauteur = h;
    }
    
     public void setnaturel(boolean n)
    {
        this.naturel = n;
    }
    
 
    
    
    
    
    
   
    
  
  
    
    
}
