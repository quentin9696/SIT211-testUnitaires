package voitures;

public class Auto {
	private String marque;
	private String modele;
	private float prix;
	private float consommation;
	private int kilometrage;
	private int nb_portes;
	private int nb_places;

	Auto(String vmarque, String vmodele, 
			float vprix, float vconsommation, 
			int vkilometrage, int vnb_portes, int vnb_places)
	{	
		// Initialise l'objet Auto courant avec les valeurs en paramètres
	}

	public String getModele()
	{
		// renvoie le modèle de l'Auto courante
		return "";
	}

	public String getMarque()
	{
		// renvoie la marque de l'Auto courante
		return "";
	}

	public float getPrix()
	{
		// renvoie le prix de l'Auto courante
		return (float)0;
	}

	public float getConso()
	{
		// renvoie la consommation de l'Auto courante
		return (float)0;
	}
	
	public int getKilometrage()
	{
		// renvoie le kilométrage de l'Auto courante
		return 0;
	}

	public int getNbPortes()
	{
		// renvoie le nombre de portes de l'Auto courante
		return 0;
	}

	public int getNbPlaces()
	{
		// renvoie le nombre de places de l'Auto courante
		return 0;
	}
	
	public void afficher()
	{
		System.out.println("      Marque : "+this.getMarque());
		System.out.println("      Modele : "+this.getModele());
		System.out.println("      Prix : "+this.getPrix());
		System.out.println("      Consommation : "+this.getConso());
		System.out.println("      Kilometrage : "+this.getKilometrage());
		System.out.println("      Nombre de Portes : "+this.getNbPortes());
		System.out.println("      Nombre de Places : "+this.getNbPlaces());
	}
}
